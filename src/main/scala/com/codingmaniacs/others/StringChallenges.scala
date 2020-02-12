package com.codingmaniacs.others

import scala.annotation.tailrec
import scala.util.matching.Regex

object StringChallenges {
  val extractionPattern: Regex = "(.*)([a-zA-Z\\s])$".r

  /**
    * Given a string it returns the reverse of the string using foldRight
    *
    * @param str String
    * @return Reverse representation of the string
    */
  def flip(str: String): String = str.foldRight("")((el, acc) => acc + el)

  /**
    * Given a string it returns the number of words contained in the string
    *
    * @param str String
    * @return Number of words found on the string using split method
    */
  def wordCountWithSplit(str: String): Int =
    str
      .trim
      .split(" ")
      .map(w => w.trim)
      .count(w => !w.equals(""))

  /**
    * Given a string it returns the number of words contained in the string
    *
    * @param str String
    * @return Number of words found on the string using recursion
    */
  def wordCountWithRec(str: String): Int = {
    @tailrec
    def reduce(res: Int, currentChar: Option[Char], remaining: List[Char]): Int =
      (remaining, currentChar) match {
        case (Nil, _)                                => res
        case (h :: t, None)                          => reduce(res + 1, Some(h), t)
        case (h :: t, Some(c)) if c == 32 && h != 32 => reduce(res + 1, Some(h), t)
        case (h :: t, _)                             => reduce(res, Some(h), t)
      }

    val characters = str.trim.toList
    reduce(0, None, characters)
  }

}
