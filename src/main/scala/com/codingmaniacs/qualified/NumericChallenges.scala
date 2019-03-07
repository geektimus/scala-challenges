package com.codingmaniacs.qualified

object NumericChallenges {
  /**
    * Returns the string representation of a given number, providing the ordinal representation of the given number
    *
    * @param value number
    * @return Ordinal representation of i
    */
  def fromNumber(value: Int): String = {
    value match {
      case 0 => "0"
      case _ => s"$value${returnPrefixForValue(value)}"
    }
  }

  def returnPrefixForValue(value: Int): String = {
    val lastTwoDigits = value % 100
    val lastDigit = lastTwoDigits % 10

    (lastDigit, lastTwoDigits) match {
      case (_, ltd) if ltd >= 11 && ltd <=13 => "th"
      case (1, _) => "st"
      case (2, _) => "nd"
      case (3, _) => "rd"
      case _ => "th"
    }
  }
}
