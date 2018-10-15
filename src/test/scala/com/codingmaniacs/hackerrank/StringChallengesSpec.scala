package com.codingmaniacs.hackerrank

import org.specs2.mutable.Specification

class StringChallengesSpec extends Specification {

  "The reduce by pairs function" should {
    "reduce an empty string" in {
      val s = ""
      val expected = "Empty String"
      val result = StringChallenges.reduceByPairs(s)
      result mustEqual expected
    }

    "reduce an string with a pair of the same letter" in {
      val s = "aa"
      val expected = "Empty String"
      val result = StringChallenges.reduceByPairs(s)
      result mustEqual expected
    }

    "reduce aaabccddd to abd" in {
      val s = "aaabccddd"
      val expected = "abd"
      val result = StringChallenges.reduceByPairs(s)
      result mustEqual expected
    }

    "reduce baab to 'Empty String'" in {
      val s = "baab"
      val expected = "Empty String"
      val result = StringChallenges.reduceByPairs(s)
      result mustEqual expected
    }

    "reduce aaabccbdeed to a" in {
      val s = "aaabccbdeed"
      val expected = "a"
      val result = StringChallenges.reduceByPairs(s)
      result mustEqual expected
    }
  }

}
