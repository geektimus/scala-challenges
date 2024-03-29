package com.codingmaniacs.qualified

import com.codingmaniacs.qualified.StringChallenges.InvalidExpressionException
import org.specs2.mutable.Specification

class StringChallengesSpec extends Specification {
  "The number and credit card masker" should {
    "mask an empty string" in {
      val res = StringChallenges.maskNumber("")
      res mustEqual ""
    }
    "mask a small number" in {
      val str = "123"
      val expected = "123"
      val res = StringChallenges.maskNumber(str)
      res mustEqual expected
    }
    "mask a string with dashes" in {
      val str = "str-with-dashes"
      val expected = "str-with-dashes"
      val res = StringChallenges.maskNumber(str)
      res mustEqual expected
    }
    "mask a long number" in {
      val str = "1234567890987654321"
      val expected = "1##############4321"
      val res = StringChallenges.maskNumber(str)
      res mustEqual expected
    }
    "mask a credit card number" in {
      val str = "2222-3333-4444-1111"
      val expected = "2###-####-####-1111"
      val res = StringChallenges.maskNumber(str)
      res mustEqual expected
    }
  }
  "The expression evaluator" should {
    "fail when evaluating a invalid exception (mono)" in {
      (StringChallenges.evaluate("sqrt") must throwA[InvalidExpressionException]).message must endWith(
        s"A expression containing only operators is not valid"
      )
    }

    "fail when evaluating a invalid exception (binary)" in {
      (StringChallenges.evaluate("-") must throwA[InvalidExpressionException]).message must endWith(
        s"A expression containing only operators is not valid"
      )
    }

    "evaluate a empty expresion" in {
      val res = StringChallenges.evaluate("")
      res mustEqual 0.0
    }
    "evaluate a simple number" in {
      val res = StringChallenges.evaluate("3")
      res mustEqual 3
    }
    "evaluate simple number with decimals" in {
      val res = StringChallenges.evaluate("3.5")
      res mustEqual 3.5
    }
    "evaluate a meaningless expression returning the last number in the expr" in {
      val res = StringChallenges.evaluate("3 4 5")
      res mustEqual 5
    }
    "evaluate add two numbers" in {
      val res = StringChallenges.evaluate("1 3 +")
      res mustEqual (1 + 3)
    }
    "evaluate multiply two numbers" in {
      val res = StringChallenges.evaluate("2 3 *")
      res mustEqual (2 * 3)
    }
    "evaluate subtract two numbers" in {
      val res = StringChallenges.evaluate("2 5 -")
      res mustEqual (2 - 5)
    }
    "evaluate divide two numbers" in {
      val res = StringChallenges.evaluate("9 2 /")
      res mustEqual 4.5
    }
    "evaluate add two numbers with decimals" in {
      val res = StringChallenges.evaluate("10000 2345.67 +")
      res mustEqual 12345.67
    }
    "evaluate simple operations mixed" in {
      val res = StringChallenges.evaluate("3 2 1 - *")
      res mustEqual 3
    }
    "evaluate complex operations mixed 1" in {
      val res = StringChallenges.evaluate("5 1 2 + 4 * + 3 -")
      res mustEqual 14
    }
    "evaluate complex operations mixed 2" in {
      val res = StringChallenges.evaluate("7 4 5 + * 3 - 10 /")
      res mustEqual 6
    }
    "evaluate complex operations mixed 3" in {
      val res = StringChallenges.evaluate("4 4 * 3 3 * + sqrt 5 +")
      res mustEqual 10
    }
    "evaluate sqrt (simple expression)" in {
      val res = StringChallenges.evaluate("25 sqrt")
      res mustEqual 5
    }
  }
}
