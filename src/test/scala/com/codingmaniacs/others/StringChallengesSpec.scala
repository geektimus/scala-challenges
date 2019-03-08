package com.codingmaniacs.others

import org.specs2.mutable.Specification

class StringChallengesSpec extends Specification {
  "The string reverser" should {
    "handle an empty string" in {
      val s = ""
      val expected = ""
      val reverse = StringChallenges.flip(s)
      reverse mustEqual expected
    }

    "handle an string of length one" in {
      val s = "a"
      val expected = "a"
      val reverse = StringChallenges.flip(s)
      reverse mustEqual expected
    }

    "handle an string of length two" in {
      val s = "ab"
      val expected = "ba"
      val reverse = StringChallenges.flip(s)
      reverse mustEqual expected
    }

    "handle an string with duplicated characters" in {
      val s = "aaa"
      val expected = "aaa"
      val reverse = StringChallenges.flip(s)
      reverse mustEqual expected
    }

    "handle 'longer and complex words'" in {
      val s = "longer and complex words"
      val expected = "sdrow xelpmoc dna regnol"
      val reverse = StringChallenges.flip(s)
      reverse mustEqual expected
    }
  }
}
