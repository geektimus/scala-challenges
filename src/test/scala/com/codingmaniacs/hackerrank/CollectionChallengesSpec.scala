package com.codingmaniacs.hackerrank

import org.specs2.mutable.Specification

class CollectionChallengesSpec extends Specification {
  "The number finder" should {
    "say yes if the a number exist on an array" in {
      val s = Array(1, 2, 3, 4, 5)
      val element = 1
      val expected = "YES"
      val result = CollectionChallenges.findNumber(s, element)
      result mustEqual expected
    }

    "say no if the a number doesn't exist on an array" in {
      val s = Array(1, 2, 3, 4, 5)
      val element = 6
      val expected = "NO"
      val result = CollectionChallenges.findNumber(s, element)
      result mustEqual expected
    }
  }

  "The odd / even generator" should {
    "find all the odd numbers between a range" in {
      val start = 2
      val end = 5
      val oddNumbers = CollectionChallenges.oddNumbers(start, end)
      val expected = Array(3, 5)
      oddNumbers mustEqual expected
    }
  }
}
