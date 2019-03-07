package com.codingmaniacs.qualified

import org.specs2.mutable.Specification

class NumericChallengesSpec extends Specification {
  "The ordinal number method" should {
    "handle the zero (0) value" in {
      val res = NumericChallenges.fromNumber(0)
      res mustEqual "0"
    }
    "handle the basic number (1,2,3,4)" in {
      // scalastyle:off magic.number
      val numbers = List(1, 2, 3, 4)
      // scalastyle:on magic.number

      val expected = List("1st", "2nd", "3rd", "4th")
      val ordinalNumbers = numbers.map(NumericChallenges.fromNumber)

      ordinalNumbers mustEqual expected
    }
    "handle the basic number (22,33,44,55)" in {
      // scalastyle:off magic.number
      val numbers = List(22, 33, 44, 55)
      // scalastyle:on magic.number

      val expected = List("22nd", "33rd", "44th", "55th")
      val ordinalNumbers = numbers.map(NumericChallenges.fromNumber)

      ordinalNumbers mustEqual expected
    }
    "handle the special cases (11,12,13)" in {
      // scalastyle:off magic.number
      val numbers = List(11, 12, 13)
      // scalastyle:on magic.number

      val expected = List("11th", "12th", "13th")
      val ordinalNumbers = numbers.map(NumericChallenges.fromNumber)

      ordinalNumbers mustEqual expected
    }
  }
}
