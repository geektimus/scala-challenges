package com.codingmaniacs.others

import org.specs2.mutable.Specification

class NumericChallengesSpec extends Specification {

  val normalValue = 1
  val fizzValue = 6
  val buzzValue = 10
  val fizzBuzzValue = 30

  "The fizz buzz method" should {

    "return the number for numbers that are not multiples of 3 and/or 5" in {
      val s = Seq(normalValue)
      val expected = Seq("1")
      val reverse = NumericChallenges.fizzBuzz(s.toList)
      reverse mustEqual expected
    }

    "return Fizz for multiples of 3" in {
      val s = Seq(fizzValue)
      val expected = Seq("Fizz")
      val reverse = NumericChallenges.fizzBuzz(s)
      reverse mustEqual expected
    }

    "return Buzz for multiples of 5" in {
      val s = Seq(buzzValue)
      val expected = Seq("Buzz")
      val reverse = NumericChallenges.fizzBuzz(s)
      reverse mustEqual expected
    }

    "return FizzBuzz for multiples of 3 and 5" in {
      val s = Seq(fizzBuzzValue)
      val expected = Seq("FizzBuzz")
      val reverse = NumericChallenges.fizzBuzz(s)
      reverse mustEqual expected
    }
  }
}
