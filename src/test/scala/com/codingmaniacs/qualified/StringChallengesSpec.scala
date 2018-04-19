package com.codingmaniacs.qualified

import org.specs2.mutable.Specification

class StringChallengesSpec extends Specification {
  "The number and credit card masker" should {
    "mask an empty string" in {
      val res = StringChallenges.maskify("")
      res mustEqual ""
    }
    "mask a small number" in {
      val str = "123"
      val expected = "123"
      val res = StringChallenges.maskify(str)
      res mustEqual expected
    }
    "mask a short string" in {
      val str = "small"
      val expected = "small"
      val res = StringChallenges.maskify(str)
      res mustEqual expected
    }
    "mask a medium number" in {
      val str = "123456"
      val expected = "1#3456"
      val res = StringChallenges.maskify(str)
      res mustEqual expected
    }
    "mask a medium string" in {
      val str = "medium string"
      val expected = "medium string"
      val res = StringChallenges.maskify(str)
      res mustEqual expected
    }
    "mask a string with dashes" in {
      val str = "str-with-dashes"
      val expected = "str-with-dashes"
      val res = StringChallenges.maskify(str)
      res mustEqual expected
    }
    "mask a long number" in {
      val str = "1234567890987654321"
      val expected = "1##############4321"
      val res = StringChallenges.maskify(str)
      res mustEqual expected
    }
    "mask a credit card number" in {
      val str = "2222-3333-4444-1111"
      val expected = "2###-####-####-1111"
      val res = StringChallenges.maskify(str)
      res mustEqual expected
    }
  }
}