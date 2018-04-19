package com.codingmaniacs.qualified

object NumericChallenges {
  /**
    * Returns the string representation of a given number, providing the ordinal representation of the given number
    *
    * @param i number
    * @return Ordinal representation of i
    */
  def fromNumber(i: Int): String = {
    i.toString match {
      case "0" => "0"
      case n if n.endsWith("11") || n.endsWith("12") || n.endsWith("13") => i + "th"
      case n if n.endsWith("1") => i + "st"
      case n if n.endsWith("2") => i + "nd"
      case n if n.endsWith("3") => i + "rd"
      case _ => i + "th"
    }
  }
}
