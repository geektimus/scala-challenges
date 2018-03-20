package com.codingmaniacs.others

import org.scalatest.{FlatSpec, Matchers}

class StringChallengesSpec extends FlatSpec with Matchers {
  "The reverse of an empty string" should "be empty" in {
    val s = ""
    val expected = ""
    val reverse = StringChallenges.flip(s)
    assert(expected == reverse)
  }

  "The reverse of a string with one char" should "be the same char" in {
    val s = "a"
    val expected = "a"
    val reverse = StringChallenges.flip(s)
    assert(expected == reverse)
  }

  "The reverse of 'ab'" should "be 'ba'" in {
    val s = "ab"
    val expected = "ba"
    val reverse = StringChallenges.flip(s)
    assert(expected == reverse)
  }

  "The reverse of 'aaa'" should "be 'aaa'" in {
    val s = "aaa"
    val expected = "aaa"
    val reverse = StringChallenges.flip(s)
    assert(expected == reverse)
  }

  "The reverse of 'longer and complex words'" should " be 'sdrow xelpmoc dna regnol'" in {
    val s = "longer and complex words"
    val expected = "sdrow xelpmoc dna regnol"
    val reverse = StringChallenges.flip(s)
    assert(expected == reverse)
  }
}