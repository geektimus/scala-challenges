package com.codingmaniacs.codility

import org.scalatest.{FlatSpec, Matchers}

class CollectionChallengesSpec extends FlatSpec with Matchers {

  "An empty array" should "contain [1] as missing integer" in {
    val numbers = Array[Int]()
    val expected = 1
    val missingInteger = CollectionChallenges.findMissingInt(numbers)
    assert(missingInteger == expected)
  }

  "An array containing only [2]" should "contain [1] as missing integer" in {
    val numbers = Array(2)
    val expected = 1
    val missingInteger = CollectionChallenges.findMissingInt(numbers)
    assert(missingInteger == expected)
  }

  "An array containing only [1]" should "contain [2] as missing integer" in {
    val numbers = Array(1)
    val expected = 2
    val missingInteger = CollectionChallenges.findMissingInt(numbers)
    assert(missingInteger == expected)
  }

  "An array containing [1, 3, 6, 4, 1, 2]" should "contain [5] as a missing int" in {
    val numbers = Array(1, 3, 6, 4, 1, 2)
    val expected = 5
    val missingInteger = CollectionChallenges.findMissingInt(numbers)
    assert(missingInteger == expected)
  }

  "An array containing [4, 1, 5, 6, 2]" should "contain [3] as a missing int" in {
    val numbers = Array(4, 1, 5, 6, 2)
    val expected = 3
    val missingInteger = CollectionChallenges.findMissingInt(numbers)
    assert(missingInteger == expected)
  }

  "An array containing [1, 2, 3]" should "contain [4] as a missing int" in {
    val numbers = Array(1, 2, 3)
    val expected = 4
    val missingInteger = CollectionChallenges.findMissingInt(numbers)
    assert(missingInteger == expected)
  }

  "An array containing [-1,-3]" should "contain [1] as a missing int" in {
    val numbers = Array(-1, -3)
    val expected = 1
    val missingInteger = CollectionChallenges.findMissingInt(numbers)
    assert(missingInteger == expected)
  }

  "On an array containing one element, that element" should "be the unpaired one" in {
    val numbers = Array(3)
    val expected = 3
    val unpairedNumber = CollectionChallenges.findUnpairedElement(numbers)
    assert(unpairedNumber == expected)
  }

  "On an array containing three elements [1,2,2], the unpaired element" should "be [1]" in {
    val numbers = Array(1, 2, 2)
    val expected = 1
    val unpairedNumber = CollectionChallenges.findUnpairedElement(numbers)
    assert(unpairedNumber == expected)
  }

  "On an array containing seven elements [1,1,3,4,2,2,4], the unpaired element" should "be [3]" in {
    val numbers = Array(1, 1, 3, 4, 2, 2, 4)
    val expected = 3
    val unpairedNumber = CollectionChallenges.findUnpairedElement(numbers)
    assert(unpairedNumber == expected)
  }

  "On an array containing eleven elements [4,4,2,2,5,1,1,1,1,4,4], the unpaired element" should "be [5]" in {
    val numbers = Array(4, 4, 2, 2, 5, 1, 1, 1, 1, 4, 4)
    val expected = 5
    val unpairedNumber = CollectionChallenges.findUnpairedElement(numbers)
    assert(unpairedNumber == expected)
  }

  "On an array containing nine elements [4,3,2,1,5,1,2,3,4], the unpaired element" should "be [5]" in {
    val numbers = Array(4, 3, 2, 1, 5, 1, 2, 3, 4)
    val expected = 5
    val unpairedNumber = CollectionChallenges.findUnpairedElement(numbers)
    assert(unpairedNumber == expected)
  }
}
