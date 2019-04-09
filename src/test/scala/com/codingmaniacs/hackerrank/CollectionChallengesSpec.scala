package com.codingmaniacs.hackerrank

import org.specs2.mutable.Specification

class CollectionChallengesSpec extends Specification {
  "The number finder" should {
    "say yes if the a number exist on an array" in {
      // scalastyle:off magic.number
      val s = Array(1, 2, 3, 4, 5)
      // scalastyle:on magic.number
      val element = 1
      val expected = "YES"
      val result = CollectionChallenges.findNumber(s, element)
      result mustEqual expected
    }

    "say no if the a number doesn't exist on an array" in {
      // scalastyle:off magic.number
      val s = Array(1, 2, 3, 4, 5)
      // scalastyle:on magic.number
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
      // scalastyle:off magic.number
      val expected = Array(3, 5)
      // scalastyle:on magic.number
      val oddNumbers = CollectionChallenges.oddNumbers(start, end)
      oddNumbers mustEqual expected
    }
  }

  "The stair case generator" should {
    "print a right-aligned staircase of size 1" in {
      val size = 1
      val expected = List(List("#"))
      val staircase = CollectionChallenges.generateStaircase(size)
      staircase mustEqual expected
    }

    "print a right-aligned staircase of size 3" in {
      val size = 3
      val expected = List(
        List("  #"),
        List(" ##"),
        List("###")
      )
      val staircase = CollectionChallenges.generateStaircase(size)
      staircase mustEqual expected
    }

    "print a right-aligned staircase of size 6" in {
      val size = 6
      val expected = List(
        List("     #"),
        List("    ##"),
        List("   ###"),
        List("  ####"),
        List(" #####"),
        List("######")
      )
      val staircase = CollectionChallenges.generateStaircase(size)
      staircase mustEqual expected
    }
  }
}
