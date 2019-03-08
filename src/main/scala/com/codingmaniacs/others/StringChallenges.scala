package com.codingmaniacs.others

import scala.util.matching.Regex

object StringChallenges {

  val extractionPattern: Regex = "(.*)([a-zA-Z\\s])$".r

  /**
    * Given a string it returns the reverse of the string using foldRight
    *
    * @param str String
    * @return Reverse representation of the string
    */
  def flip(str: String): String = {
    str.foldRight("") ((el, acc) => acc + el)
  }
}
