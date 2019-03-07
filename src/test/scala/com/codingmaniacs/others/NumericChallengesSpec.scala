package com.codingmaniacs.others

import org.specs2.mutable.Specification

class NumericChallengesSpec extends Specification {

  val NORMAL_VALUE = 1
  val FIZZ_VALUE = 6
  val BUZZ_VALUE = 10
  val FIZZ_BUZZ_VALUE = 30

  "The fizz buzz method" should {

    "return the number for numbers that are not multiples of 3 and/or 5" in {
      val s = Seq(NORMAL_VALUE)
      val expected = Seq("1")
      val reverse = NumericChallenges.fizzBuzz(s.toList)
      reverse mustEqual expected
    }

    "return Fizz for multiples of 3" in {
      val s = Seq(FIZZ_VALUE)
      val expected = Seq("Fizz")
      val reverse = NumericChallenges.fizzBuzz(s)
      reverse mustEqual expected
    }

    "return Buzz for multiples of 5" in {
      val s = Seq(BUZZ_VALUE)
      val expected = Seq("Buzz")
      val reverse = NumericChallenges.fizzBuzz(s)
      reverse mustEqual expected
    }

    "return FizzBuzz for multiples of 3 and 5" in {
      val s = Seq(FIZZ_BUZZ_VALUE)
      val expected = Seq("FizzBuzz")
      val reverse = NumericChallenges.fizzBuzz(s)
      reverse mustEqual expected
    }
  }
}
