package com.codingmaniacs.qualified

import scala.annotation.tailrec

object StringChallenges {
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

    @tailrec
    def eval(values: List[Double], nextChunk: List[String]): Double = (values, nextChunk) match {
      case (Nil, Nil) => 0.0
      case (v, Nil) => v.headOption.getOrElse(0.0)
      case (v, n) if isNumber(n.headOption) => eval(n.headOption.getOrElse("0").toDouble :: v, n.tail)
      case (v, op) if !isNumber(op.headOption) =>
        val n = v.headOption.getOrElse(0.0)
        op.headOption.getOrElse("") match {
          case "+" => eval(v.tail.headOption.getOrElse(0.0) + n :: v.tail.tail, op.tail)
          case "-" => eval(v.tail.headOption.getOrElse(0.0) - n :: v.tail.tail, op.tail)
          case "*" => eval(v.tail.headOption.getOrElse(0.0) * n :: v.tail.tail, op.tail)
          case "/" => eval(v.tail.headOption.getOrElse(0.0) / n :: v.tail.tail, op.tail)
          case "sqrt" => eval(Math.sqrt(n) :: v.tail, op.tail)
          case _ => 0.0
        }

    }

    eval(List.empty[Double], expr.split(" ").toList)
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

  /**
    * Allow us to find if a given string represents a number.
    *
    * @return true if the string represents a number, false otherwise.
    */
  val isNumber: Option[String] => Boolean = (s: Option[String]) => {
    val numberRegex = """(\d+\.*\d*)""".r
    s match {
      case Some(v) => v match {
        case numberRegex(_*) => true
        case _ => false
      }
      case None => false
    }
  }
}
