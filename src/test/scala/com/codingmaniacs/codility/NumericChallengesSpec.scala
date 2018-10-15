package com.codingmaniacs.codility

import org.specs2.mutable.Specification

class NumericChallengesSpec extends Specification {

  "The binary gap function" should {
    "return one as the binary gap of five (0101)" in {
      val n = 5
      val expected = 1
      val binaryGap = NumericChallenges.findBinaryGap(n)
      binaryGap mustEqual expected
    }

    "return one as the binary gap of twenty (10100)" in {
      val n = 20
      val expected = 1
      val binaryGap = NumericChallenges.findBinaryGap(n)
      binaryGap mustEqual expected
    }

    "return zero as the binary gap of fifteen (11111)" in {
      val n = 15
      val expected = 0
      val binaryGap = NumericChallenges.findBinaryGap(n)
      binaryGap mustEqual expected
    }
  }

  "To determine the number of jumps of a frog, the function" should {
    "return 3 jumps to go from [10 to 85] given a jump distance of 30" in {
      val x = 10
      val y = 85
      val d = 30
      val expected = 3
      val jumps = NumericChallenges.frogJumps(x, y, d)
      jumps mustEqual expected
    }

    "return 142.730.189 jumps to go from [3 to 999111321] given a jump distance of 7" in {
      val x = 3
      val y = 999111321
      val d = 7
      val expected = 142730189
      val jumps = NumericChallenges.frogJumps(x, y, d)
      jumps mustEqual expected
    }
  }
}
