package com.codingmaniacs.codility

import org.scalatest.{FlatSpec, Matchers}

class NumericChallengesSpec extends FlatSpec with Matchers {
  "The binary gap of five (0101)" should "be one" in {
    val n = 5
    val expected = 1
    val binaryGap = NumericChallenges.findBinaryGap(n)
    assert(binaryGap == expected)
  }

  "The binary gap of twenty (10100)" should "be one" in {
    val n = 20
    val expected = 1
    val binaryGap = NumericChallenges.findBinaryGap(n)
    assert(binaryGap == expected)
  }

  "The binary gap of fifteen (11111)" should "be one" in {
    val n = 15
    val expected = 0
    val binaryGap = NumericChallenges.findBinaryGap(n)
    assert(binaryGap == expected)
  }

  "The number of jumps to go from  [10 to 85] given a jump distance of 30" should "be 3" in {
    val x = 10
    val y = 85
    val d = 30
    val expected = 3
    val jumps = NumericChallenges.frogJumps(x, y, d)
    assert(jumps == expected)
  }

  "The number of jumps to go from  [3 to 999111321] given a jump distance of 7" should "be 142730189" in {
    val x = 3
    val y = 999111321
    val d = 7
    val expected = 142730189
    val jumps = NumericChallenges.frogJumps(x, y, d)
    assert(jumps == expected)
  }
}
