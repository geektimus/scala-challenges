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
  def flip(str: String): String = {
    str.foldRight("") ((el, acc) => acc + el)
  }

  def wordCountWithSplit(str: String): Int = {
    str
      .trim
      .split(" ")
      .map(w => w.trim)
      .count(w => !w.equals(""))
  }

  def wordCountWithRec(str: String): Int = {

    @tailrec
    def wordCountRec(charSeq: List[Char], spaces: Int): Int = {
      charSeq match {
        case Nil => spaces + 1
        case h :: th :: tail if h == 32 && th == 32 => {
          wordCountRec(th :: tail, spaces)
        }
        case h :: th :: tail if h == 32 && th != 32 => {
          wordCountRec(tail, spaces + 1)
        }
        case _ :: tail => {
          wordCountRec(tail, spaces)
        }
      }
    }
    str match {
      case "" => 0
      case _ =>
        val trimmed = str.trim
        val sequence = trimmed.toList
        wordCountRec(sequence, 0)
    }
  }
}
