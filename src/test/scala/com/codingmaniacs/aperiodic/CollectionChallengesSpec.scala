package com.codingmaniacs.aperiodic

import org.specs2.mutable.Specification

class CollectionChallengesSpec extends Specification {
  "To prove that we know how to use list we" should {
    "return the last element of a empty list as None" in {
      val numbers = List()
      val expected = None
      val last = CollectionChallenges.lastElement(numbers)
      last mustEqual expected
    }

    "find the last element of a list." in {
      val numbers = List(1, 2, 3, 4)
      val expected = Some(4)
      val last = CollectionChallenges.lastElement(numbers)
      last mustEqual expected
    }

    "return the last but one element of a empty list as None" in {
      val numbers = List()
      val expected = None
      val last = CollectionChallenges.penultimate(numbers)
      last mustEqual expected
    }

    "find the last but one element of a short list" in {
      val numbers = List(1, 2)
      val expected = Some(1)
      val last = CollectionChallenges.penultimate(numbers)
      last mustEqual expected
    }

    "find the last but one element of a list" in {
      val numbers = List(1, 2, 3, 4)
      val expected = Some(3)
      val last = CollectionChallenges.penultimate(numbers)
      last mustEqual expected
    }

    "return the nth element of a empty list as None" in {
      val numbers = List()
      val nthPosition = 5
      val expected = None
      val nth = CollectionChallenges.nthElement(nthPosition, numbers)
      nth mustEqual expected
    }

    "find the nth element of a list" in {
      val numbers = List(1, 1, 2, 3, 5, 8)
      val nthPosition = 2
      val expected = Some(2)
      val nth = CollectionChallenges.nthElement(nthPosition, numbers)
      nth mustEqual expected
    }

    "return the nth element of a list as None if nth > list size" in {
      val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
      val nthPosition = 20
      val expected = None
      val nth = CollectionChallenges.nthElement(nthPosition, numbers)
      nth mustEqual expected
    }

    "return zero as the size of an empty list" in {
      val numbers = List()
      val expected = 0
      val length = CollectionChallenges.length(numbers)
      length mustEqual expected
    }

    "find the number of elements of a list" in {
      val numbers = List(1, 1, 2, 3, 5, 8)
      val expected = 6
      val length = CollectionChallenges.length(numbers)
      length mustEqual expected
    }

    "not fail when trying to reverse an empty list" in {
      val numbers = List()
      val expected = List()
      val reverse = CollectionChallenges.reverse(numbers)
      reverse mustEqual expected
    }

    "reverse the elements of a list" in {
      val numbers = List(1, 1, 2, 3, 5, 8)
      val expected = List(8, 5, 3, 2, 1, 1)
      val reverse = CollectionChallenges.reverse(numbers)
      reverse mustEqual expected
    }

    "show that an empty list is always a palindrome" in {
      val numbers = List()
      val isPalindrome = CollectionChallenges.isPalindrome(numbers)
      isPalindrome must beTrue
    }

    "find if a list is a palindrome (true)" in {
      val numbers = List(1, 2, 3, 2, 1)
      val isPalindrome = CollectionChallenges.isPalindrome(numbers)
      isPalindrome must beTrue
    }

    "find if a list is a palindrome (false)" in {
      val numbers = List(1, 2, 3, 4, 5)
      val isPalindrome = CollectionChallenges.isPalindrome(numbers)
      isPalindrome must beFalse
    }
  }
}
