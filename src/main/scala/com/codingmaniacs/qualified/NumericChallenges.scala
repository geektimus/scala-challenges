package com.codingmaniacs.qualified

object NumericChallenges {
  /**
    * Returns the string representation of a given number, providing the ordinal representation of the given number
    *
    * @param i number
    * @return Ordinal representation of i
    */
  def fromNumber(i: Int): String = {
    def returnPrefixForValue(value: Int): String = {

      val lastTwoDigits = value % 100;
      val lastDigit = lastTwoDigits % 10;

      (lastDigit, lastTwoDigits) match {
        case (_, ltd) if ltd >= 11 && ltd <=13 => "th"
        case (1, _) => "st"
        case (2, _) => "nd"
        case (3, _) => "rd"
        case _ => "th"
      }
    }
    if (i == 0) { "0" } else {i + returnPrefixForValue(i)}
  }
}
