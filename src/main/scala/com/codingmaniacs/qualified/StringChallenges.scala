package com.codingmaniacs.qualified

object StringChallenges {

  sealed trait ExprToken

  final case class Number(n: Double) extends ExprToken

  final case class BinOperator(symbol: String, op: (Double, Double) => Double) extends ExprToken

  final case class MonoOperator(symbol: String, op: Double => Double) extends ExprToken

  object BinOperator {
    def apply(symbol: String): BinOperator = {
      symbol match {
        case "+" => BinOperator("+", (x, y) => x + y)
        case "*" => BinOperator("*", (x, y) => x * y)
        case "-" => BinOperator("-", (x, y) => x - y)
        case "/" => BinOperator("/", (x, y) => x / y)
      }
    }
  }

  /**
    * Mask all but the first and the last four characters of a number
    *
    * @note A valid number for this function is a number or a sequence of four
    *       number separated by dashes (-)
    * @param ccNumber The number
    * @return The masked number if ccNumber is not a string.
    */
  def maskNumber(ccNumber: String): String = {

    ccNumber match {
      case nonNumber if !isValid(nonNumber) => nonNumber
      case number =>
        val ccLen = number.length

        val initial = number.substring(0, 1)
        val tail = number.substring(ccLen - 4)
        val middle = number.substring(1, ccLen - 4).replaceAll("[0-9]", "#")
        initial + middle + tail
    }
  }

  /**
    * Evaluates a mathematical expression given on infix notation (n m operation)
    *
    * @param expr Mathematical expression
    * @return The result of the evaluation of the math expression
    */
  def evaluate(expr: String): Double = {
    val solution = parseTokensToExpr _ andThen foldExpr
    val result = solution(expr.split(" ").toList).lastOption
    result match {
      case Some(Number(n)) => n
      case None => 0.0
    }
  }

  def parseTokensToExpr(strTokens: List[String]): List[ExprToken] = {
    strTokens.map {
      case tk if tk.matches("^[0-9]+(.[0-9]+)?") => Number(tk.toDouble)
      case tk if tk.equals("sqrt") => MonoOperator("sqrt", n => Math.sqrt(n))
      case tk => BinOperator(tk)
    }
  }

  def foldExpr(tokens: List[ExprToken]): List[ExprToken] = {
    tokens.foldLeft(List[ExprToken]())((acc, expr) => {
      (acc, expr) match {
        case (Nil, n: Number) => List(n)
        case (init :+ Number(a) :+ Number(b), BinOperator(_, op)) => init ++ List(Number(op.apply(a, b)))
        case (init :+ Number(a), MonoOperator(_, op)) => init ++ List(Number(op.apply(a)))
        case (l, e) => l ++ List(e)
      }
    })
  }


  /**
    * Allow us to define if the given string follows the rules required to consider
    * this string as a valid number, i.e, this string should not contain letters or symbols other than dashes
    *
    * @return true if this is a valid string, false otherwise.
    */
  val isValid: String => Boolean = (str: String) => {
    val pattern = "[0-9\\-]".r
    str.length > 5 && pattern.findFirstMatchIn(str).isDefined
  }
}
