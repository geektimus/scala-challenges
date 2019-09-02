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
      // scalastyle:off magic.number
      val numbers = List(1, 2, 3, 4)
      val expected = Some(4)
      // scalastyle:on magic.number
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
      // scalastyle:off magic.number
      val numbers = List(1, 2, 3, 4)
      // scalastyle:on magic.number
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
      // scalastyle:off magic.number
      val numbers = List(1, 1, 2, 3, 5, 8)
      // scalastyle:on magic.number
      val nthPosition = 2
      val expected = Some(2)
      val nth = CollectionChallenges.nthElement(nthPosition, numbers)
      nth mustEqual expected
    }

    "return the nth element of a list as None if nth > list size" in {
      // scalastyle:off magic.number
      val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
      // scalastyle:on magic.number
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
      // scalastyle:off magic.number
      val numbers = List(1, 1, 2, 3, 5, 8)
      // scalastyle:on magic.number
      val expected = 6
      val length = CollectionChallenges.length(numbers)
      length mustEqual expected
    }

    "return zero as the size of an empty list (folding)" in {
      val numbers = List()
      val expected = 0
      val length = CollectionChallenges.lengthWithFold(numbers)
      length mustEqual expected
    }

    "find the number of elements of a list (folding)" in {
      // scalastyle:off magic.number
      val numbers = List(1, 1, 2, 3, 5, 8)
      // scalastyle:on magic.number
      val expected = 6
      val length = CollectionChallenges.lengthWithFold(numbers)
      length mustEqual expected
    }

    "not fail when trying to reverse an empty list" in {
      val numbers = List()
      val expected = List()
      val reverse = CollectionChallenges.reverse(numbers)
      reverse mustEqual expected
    }

    "reverse the elements of a list" in {
      // scalastyle:off magic.number
      val numbers = List(1, 1, 2, 3, 5, 8)
      val expected = List(8, 5, 3, 2, 1, 1)
      // scalastyle:on magic.number
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
      // scalastyle:off magic.number
      val numbers = List(1, 2, 3, 4, 5)
      val isPalindrome = CollectionChallenges.isPalindrome(numbers)
      // scalastyle:on magic.number
      isPalindrome must beFalse
    }

    "flatten a empty list" in {
      val numbers = List()
      val expected = List()
      val flattenList = CollectionChallenges.flatten(numbers)
      flattenList mustEqual expected
    }

    "flatten a list of lists of one item" in {
      val numbers = List(List(1, 1))
      val expected = List(1, 1)
      val flattenList = CollectionChallenges.flatten(numbers)
      flattenList mustEqual expected
    }

    "flatten a list of lists of several items" in {
      // scalastyle:off magic.number
      val numbers = List(List(1, 1), 2, List(3, List(5, 8)))
      val expected = List(1, 1, 2, 3, 5, 8)
      // scalastyle:on magic.number
      val flattenList = CollectionChallenges.flatten(numbers)
      flattenList mustEqual expected
    }

    "compress consecutive elements on a singleton list" in {
      val elements = List('a)
      val expected = List('a)
      val compressedList = CollectionChallenges.compress(elements)
      compressedList mustEqual expected
    }

    "compress consecutive elements on a list into one" in {
      val elements = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      val expected = List('a, 'b, 'c, 'a, 'd, 'e)
      val compressedList = CollectionChallenges.compress(elements)
      compressedList mustEqual expected
    }

    "compress consecutive elements on a singleton list (folding)" in {
      val elements = List('a)
      val expected = List('a)
      val compressedList = CollectionChallenges.compressWithFold(elements)
      compressedList mustEqual expected
    }

    "compress consecutive elements on a list into one (folding)" in {
      val elements = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      val expected = List('a, 'b, 'c, 'a, 'd, 'e)
      val compressedList = CollectionChallenges.compressWithFold(elements)
      compressedList mustEqual expected
    }

    "pack similar consecutive items in a empty list (span)" in {
      val elements = List()
      val expected = List()
      val packedList = CollectionChallenges.pack(elements)
      packedList mustEqual expected
    }

    "pack similar consecutive items in a list (span)" in {
      val elements = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      val expected = List(
        List('a, 'a, 'a, 'a),
        List('b),
        List('c, 'c),
        List('a, 'a),
        List('d),
        List('e, 'e, 'e, 'e)
      )
      val packedList = CollectionChallenges.pack(elements)
      packedList mustEqual expected
    }

    "length encoding on a empty list (tailrec)" in {
      val elements = List()
      val expected = List()
      val lengthEncoded = CollectionChallenges.recursiveEncode(elements)
      lengthEncoded mustEqual expected
    }

    "length encoding on a list (tailrec)" in {
      val elements = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      val expected = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
      val lengthEncoded = CollectionChallenges.recursiveEncode(elements)
      lengthEncoded mustEqual expected
    }

    "length encoding on a empty list (composition)" in {
      val elements = List()
      val expected = List()
      val lengthEncoded = CollectionChallenges.encodeComposed(elements)
      lengthEncoded mustEqual expected
    }

    "length encoding on a list (composition)" in {
      val elements = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      val expected = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
      val lengthEncoded = CollectionChallenges.encodeComposed(elements)
      lengthEncoded mustEqual expected
    }

    "encode an empty list" in {
      val elements = List(List())
      val expected = List()
      val res = CollectionChallenges.composableEncode(elements)
      res mustEqual expected
    }

    "count the occurrences and group the elements on a list" in {
      val elements = List(
        List('a, 'a, 'a, 'a),
        List('b),
        List('c, 'c),
        List('a, 'a),
        List('d),
        List('e, 'e, 'e, 'e)
      )
      val expected = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
      val res = CollectionChallenges.composableEncode(elements)
      res mustEqual expected
    }
  }
}
