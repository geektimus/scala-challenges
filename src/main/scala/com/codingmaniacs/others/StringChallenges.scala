package com.codingmaniacs.others

import scala.annotation.tailrec

object StringChallenges {
  /**
    * Given a string it returns the reverse of the string
    *
    * @param str String
    * @return Reverse representation of the string
    */
  def flip(str: String): String = {
    @tailrec
    def reverser(str: String, acc: String): String = {
      str match {
        case s if s.length == 0 => acc
        case x => reverser(x.substring(0, x.length - 1), acc + x.last)
      }
    }

    reverser(str, "")
  }
}
