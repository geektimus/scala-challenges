package com.codingmaniacs.others

import org.specs2.mutable.Specification

class StringChallengesSpec extends Specification {
  "The string reverser (using fold)" should {
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

  "The string analyzer" should {
    "count the number of words on an empty string as zero (0)" in {
      val s = ""
      val expected = 0
      val count = StringChallenges.wordCountWithSplit(s)
      count mustEqual expected
    }

    "count the number of words on a simple word as one (1)" in {
      val s = "simple"
      val expected = 1
      val count = StringChallenges.wordCountWithSplit(s)
      count mustEqual expected
    }

    "count the number of words on a phrase" in {
      val s = "simple1 simple2 simple3"
      val expected = 3
      val count = StringChallenges.wordCountWithSplit(s)
      count mustEqual expected
    }

    "count the number of words on a phrase with spaces at the start" in {
      val s = "       simple1 simple2 simple3"
      val expected = 3
      val count = StringChallenges.wordCountWithSplit(s)
      count mustEqual expected
    }

    "count the number of words on a phrase with spaces at the end" in {
      val s = "simple1 simple2 simple3      "
      val expected = 3
      val count = StringChallenges.wordCountWithSplit(s)
      count mustEqual expected
    }

    "count the number of words on a phrase with spaces all over the place" in {
      val s = "   simple1    simple2  simple3      "
      val expected = 3
      val count = StringChallenges.wordCountWithSplit(s)
      count mustEqual expected
    }

    "count the number of words on an empty string as zero (0)" in {
      val s = ""
      val expected = 0
      val count = StringChallenges.wordCountWithRec(s)
      count mustEqual expected
    }

    "count the number of words on a simple word as one (1)" in {
      val s = "simple"
      val expected = 1
      val count = StringChallenges.wordCountWithRec(s)
      count mustEqual expected
    }

    "count the number of words on a phrase" in {
      val s = "simple1 simple2 simple3"
      val expected = 3
      val count = StringChallenges.wordCountWithRec(s)
      count mustEqual expected
    }

    "count the number of words on a phrase with spaces at the start" in {
      val s = "       simple1 simple2 simple3"
      val expected = 3
      val count = StringChallenges.wordCountWithRec(s)
      count mustEqual expected
    }

    "count the number of words on a phrase with spaces at the end" in {
      val s = "simple1 simple2 simple3      "
      val expected = 3
      val count = StringChallenges.wordCountWithRec(s)
      count mustEqual expected
    }

    "count the number of words on a phrase with spaces all over the place" in {
      val s = "   simple1    simple2  simple3      "
      val expected = 3
      val count = StringChallenges.wordCountWithRec(s)
      count mustEqual expected
    }
  }
}
