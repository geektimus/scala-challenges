package com.codingmaniacs.codility

import org.scalatest.{FlatSpec, Matchers}

class NumericChallengesSpec extends FlatSpec with Matchers {
  "The binary gap of five (0101)" should "be one" in {
    val n = 5
    val expected = 1
    val binaryGap = NumericChallenges.findBinaryGap(n)
    assert(expected == binaryGap)
  }

  "The binary gap of twenty (10100)" should "be one" in {
    val n = 20
    val expected = 1
    val binaryGap = NumericChallenges.findBinaryGap(n)
    assert(expected == binaryGap)
  }

  "The binary gap of fifteen (11111)" should "be one" in {
    val n = 15
    val expected = 0
    val binaryGap = NumericChallenges.findBinaryGap(n)
    assert(expected == binaryGap)
  }
}
