package com.codingmaniacs.others

import org.specs2.mutable.Specification

class NumericChallengesSpec extends Specification {
  "The fizz buzz method" should {

    "return the number for numbers that are not multiples of 3 and/or 5" in {
      val s = Seq(1, 2, 4, 7, 8)
      val expected = Seq("1", "2", "4", "7", "8")
      val reverse = NumericChallenges.fizzBuzz(s)
      reverse mustEqual expected
    }

    "return Fizz for multiples of 3" in {
      val s = Seq(3, 6, 9, 12)
      val expected = Seq("Fizz", "Fizz", "Fizz", "Fizz")
      val reverse = NumericChallenges.fizzBuzz(s)
      reverse mustEqual expected
    }

    "return Buzz for multiples of 5" in {
      val s = Seq(5, 10, 20, 25)
      val expected = Seq("Buzz", "Buzz", "Buzz", "Buzz")
      val reverse = NumericChallenges.fizzBuzz(s)
      reverse mustEqual expected
    }

    "return FizzBuzz for multiples of 3 and 5" in {
      val s = Seq(0, 15, 30, 45, 60)
      val expected = Seq("FizzBuzz", "FizzBuzz", "FizzBuzz", "FizzBuzz", "FizzBuzz")
      val reverse = NumericChallenges.fizzBuzz(s)
      reverse mustEqual expected
    }
  }
}
