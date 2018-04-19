package com.codingmaniacs.qualified

import org.specs2.mutable.Specification

class NumericChallengesSpec extends Specification {
  "The ordinal number method" should {
    "handle the zero (0) value" in {
      val res = NumericChallenges.fromNumber(0)
      res mustEqual "0"
    }
    "handle the basic number (1,2,3,4)" in {
      List((1, "1st"), (2, "2nd"), (3, "3rd"), (4, "4th"))
        .foreach(el => {
          val res = NumericChallenges.fromNumber(el._1)
          res mustEqual el._2
        })
      // TODO Find a way to test multiple things without the need for this 1 = 1 statement to force this to compile
      "1" mustEqual "1"
    }
    "handle the basic number (22,33,44,55)" in {
      List((22, "22nd"), (33, "33rd"), (44, "44th"), (55, "55th"))
        .foreach(el => {
          val res = NumericChallenges.fromNumber(el._1)
          res mustEqual el._2
        })
      // TODO Find a way to test multiple things without the need for this 1 = 1 statement to force this to compile
      "1" mustEqual "1"
    }
    "handle the special cases (11,12,13)" in {
      List((11, "11th"), (12, "12th"), (13, "13th"))
        .foreach(el => {
          val res = NumericChallenges.fromNumber(el._1)
          res mustEqual el._2
        })
      // TODO Find a way to test multiple things without the need for this 1 = 1 statement to force this to compile
      "1" mustEqual "1"
    }
  }
}
