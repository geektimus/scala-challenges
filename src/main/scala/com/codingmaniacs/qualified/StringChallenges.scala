package com.codingmaniacs.qualified

import scala.collection.mutable

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
    val ccLen = ccNumber.length

    if (!isValid(ccNumber))
      return ccNumber

    val initial = ccNumber.substring(0, 1)
    val tail = ccNumber.substring(ccLen - 4)
    val middle = ccNumber.substring(1, ccLen - 4).replaceAll("[0-9]", "#")
    initial + middle + tail
  }

  /**
    * Allow us to define if the given string follows the rules required to consider
    * this string as a valid number, i.e, this string should not contain letters or symbols other than dashes
    *
    * @param str Any string to be validated
    * @return true if this is a valid string, false otherwise.
    */
  def isValid(str: String): Boolean = {
    val pattern = "[0-9\\-]".r
    str.length > 5 && pattern.findFirstMatchIn(str).isDefined
  }

  /**
    * Evaluates a mathematical expression given on infix notation (n m operation)
    *
    * @param expr Mathematical expression
    * @return The result of the evaluation of the math expression
    */
  def evaluate(expr: String): Double = {
    if (expr.trim.isEmpty)
      return 0

    val expArr = expr.split(" ")
    val stack = mutable.Stack[Double]()
    for (el <- expArr) {
      if (el.matches("\\d+(.\\d+)?")) {
        //number
        stack.push(el.toDouble)
      } else {
        // operation

        val total = el match {
          case "+" =>
            val r = stack.pop()
            val l = stack.pop()
            l + r

          case "-" =>
            val r = stack.pop()
            val l = stack.pop()
            l - r

          case "*" =>
            val r = stack.pop()
            val l = stack.pop()
            l * r

          case "/" =>
            val r = stack.pop()
            val l = stack.pop()
            l / r

          case "sqrt" =>
            val l = stack.pop()
            Math.sqrt(l)

          case _ => println("Error: Unknown operation $el")
            0
        }
        stack.push(total)
      }
    }
    stack.pop()
  }

}
