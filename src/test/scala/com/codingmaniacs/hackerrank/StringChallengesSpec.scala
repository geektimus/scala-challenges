package com.codingmaniacs.hackerrank

import org.scalatest.{FlatSpec, Matchers}

class StringChallengesSpec  extends FlatSpec with Matchers {
  "The reduction of an empty string" should "be the label 'Empty String'" in {
    val s = ""
    val expected = "Empty String"
    val result = StringChallenges.reduceByPairs(s)
    assert(result == expected)
  }

  "The reduction of a string with a pair of the same letter" should "be the label 'Empty String'" in {
    val s = "aa"
    val expected = "Empty String"
    val result = StringChallenges.reduceByPairs(s)
    assert(result == expected)
  }

  "The reduction of aaabccddd" should "be abd" in {
    val s = "aaabccddd"
    val expected = "abd"
    val result = StringChallenges.reduceByPairs(s)
    assert(result == expected)
  }

  "The reduction of baab" should "be the label 'Empty String'" in {
    val s = "baab"
    val expected = "Empty String"
    val result = StringChallenges.reduceByPairs(s)
    assert(result == expected)
  }

  "The reduction of aaabccbdeed" should "be a" in {
    val s = "aaabccbdeed"
    val expected = "a"
    val result = StringChallenges.reduceByPairs(s)
    assert(result == expected)
  }
}
