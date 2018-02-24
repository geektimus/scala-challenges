package com.codingmaniacs.challenges

import org.scalatest.{FlatSpec, Matchers}

class CollectionChallengesSpec extends FlatSpec with Matchers {

  "An empty array" should "contain [1] as missing integer" in {
    val numbers = Array[Int]()
    val expected = 1
    val missingInteger = CollectionChallenges.findMissingInt(numbers)
    assert(expected == missingInteger)
  }

  "An array containing only [2]" should "contain [1] as missing integer" in {
    val numbers = Array(2)
    val expected = 1
    val missingInteger = CollectionChallenges.findMissingInt(numbers)
    assert(expected == missingInteger)
  }

  "An array containing only [1]" should "contain [2] as missing integer" in {
    val numbers = Array(1)
    val expected = 2
    val missingInteger = CollectionChallenges.findMissingInt(numbers)
    assert(expected == missingInteger)
  }

  "An array containing [1, 3, 6, 4, 1, 2]" should "contain [5] as a missing int" in {
    val numbers = Array(1, 3, 6, 4, 1, 2)
    val expected = 5
    val missingInteger = CollectionChallenges.findMissingInt(numbers)
    assert(expected == missingInteger)
  }

  "An array containing [4, 1, 5, 6, 2]" should "contain [3] as a missing int" in {
    val numbers = Array(4, 1, 5, 6, 2)
    val expected = 3
    val missingInteger = CollectionChallenges.findMissingInt(numbers)
    assert(expected == missingInteger)
  }

  "An array containing [1, 2, 3]" should "contain [4] as a missing int" in {
    val numbers = Array(1, 2, 3)
    val expected = 4
    val missingInteger = CollectionChallenges.findMissingInt(numbers)
    assert(expected == missingInteger)
  }

  "An array containing [-1,-3]" should "contain [1] as a missing int" in {
    val numbers = Array(-1,-3)
    val expected = 1
    val missingInteger = CollectionChallenges.findMissingInt(numbers)
    assert(expected == missingInteger)
  }
}
