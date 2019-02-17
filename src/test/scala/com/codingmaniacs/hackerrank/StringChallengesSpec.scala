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

  "The gemstone finder" should {
    "return zero gemstones when given an empty string" in {
      val s = Seq("")
      val expected = 0
      val res = StringChallenges.findGemstones(s)
      res mustEqual expected
    }

    "return zero gemstones when given an empty set" in {
      val s = Seq()
      val expected = 0
      val res = StringChallenges.findGemstones(s)
      res mustEqual expected
    }

    "return one gemstone when given a simple string with one letter (gemstone)" in {
      val s = Seq("a")
      val expected = 1
      val res = StringChallenges.findGemstones(s)
      res mustEqual expected
    }

    "return one gemstone when given a simple string with one letter (gemstone)" in {
      val s = Seq("a")
      val expected = 1
      val res = StringChallenges.findGemstones(s)
      res mustEqual expected
    }

    "return three gemstones when given a string with three different letters (gemstones)" in {
      val s = Seq("abc")
      val expected = 3
      val res = StringChallenges.findGemstones(s)
      res mustEqual expected
    }

    "return two gemstones when given 'aba' with ab as unique gemstones" in {
      val s = Seq("aba")
      val expected = 2
      val res = StringChallenges.findGemstones(s)
      res mustEqual expected
    }

    "return two gemstones when extended to multiple elements 'abcdde', 'baccd', 'eeabg'" in {
      val s = Seq("abcdde", "baccd", "eeabg")
      val expected = 2 // a, b
      val res = StringChallenges.findGemstones(s)
      res mustEqual expected
    }

    "return four gemstones when extended to multiple elements 'basdfj','asdlkjfdjsa', 'bnafvfnsd', 'oafhdlasd'" in {
      val s = Seq("basdfj", "asdlkjfdjsa", "bnafvfnsd", "oafhdlasd")
      val expected = 4
      val res = StringChallenges.findGemstones(s)
      res mustEqual expected
    }

    "return zero gemstones when extended to multiple non common elements 'vtrjvgbj', 'mkmjyaeav', 'sibzdmsk'" in {
      val s = Seq("vtrjvgbj", "mkmjyaeav", "sibzdmsk")
      val expected = 0
      val res = StringChallenges.findGemstones(s)
      res mustEqual expected
    }
  }
}
