package com.codingmaniacs.codility

import org.specs2.mutable.Specification

class CollectionChallengesSpec extends Specification {

  "The find missing integer function" should {
    "show that [1] is a missing integer on an empty array" in {
      val numbers = Array[Int]()
      val expected = 1
      val missingInteger = CollectionChallenges.findMissingInt(numbers)
      missingInteger mustEqual expected
    }

    "show that [1] is a missing integer on [2]" in {
      val numbers = Array(2)
      val expected = 1
      val missingInteger = CollectionChallenges.findMissingInt(numbers)
      missingInteger mustEqual expected
    }

    "show that [2] is a missing integer on [1]" in {
      val numbers = Array(1)
      val expected = 2
      val missingInteger = CollectionChallenges.findMissingInt(numbers)
      missingInteger mustEqual expected
    }

    "show that [5] is a missing integer on [1, 3, 6, 4, 1, 2]" in {
      // scalastyle:off magic.number
      val numbers = Array(1, 3, 6, 4, 1, 2)
      // scalastyle:on magic.number
      val expected = 5
      val missingInteger = CollectionChallenges.findMissingInt(numbers)
      missingInteger mustEqual expected
    }

    "show that [3] is a missing integer on [4, 1, 5, 6, 2]" in {
      // scalastyle:off magic.number
      val numbers = Array(4, 1, 5, 6, 2)
      // scalastyle:on magic.number
      val expected = 3
      val missingInteger = CollectionChallenges.findMissingInt(numbers)
      missingInteger mustEqual expected
    }

    "show that [4] is a missing integer on [1, 2, 3]" in {
      val numbers = Array(1, 2, 3)
      val expected = 4
      val missingInteger = CollectionChallenges.findMissingInt(numbers)
      missingInteger mustEqual expected
    }

    "show that [1] is a missing integer on [-1,-3]" in {
      // scalastyle:off magic.number
      val numbers = Array(-1, -3)
      // scalastyle:on magic.number
      val expected = 1
      val missingInteger = CollectionChallenges.findMissingInt(numbers)
      missingInteger mustEqual expected
    }
  }

  "The find unpaired element function" should {
    "return the same element if the array contains only one element" in {
      val numbers = Array(3)
      val expected = 3
      val unpairedNumber = CollectionChallenges.findUnpairedElement(numbers)
      unpairedNumber mustEqual expected
    }

    "return 1 as the unpaired element on [1,2,2]" in {
      val numbers = Array(1, 2, 2)
      val expected = 1
      val unpairedNumber = CollectionChallenges.findUnpairedElement(numbers)
      unpairedNumber mustEqual expected
    }

    "return 3 as the unpaired element on [1,1,3,4,2,2,4]" in {
      // scalastyle:off magic.number
      val numbers = Array(1, 1, 3, 4, 2, 2, 4)
      // scalastyle:on magic.number
      val expected = 3
      val unpairedNumber = CollectionChallenges.findUnpairedElement(numbers)
      unpairedNumber mustEqual expected
    }

    "return 5 as the unpaired element on [4,4,2,2,5,1,1,1,1,4,4]" in {
      // scalastyle:off magic.number
      val numbers = Array(4, 4, 2, 2, 5, 1, 1, 1, 1, 4, 4)
      // scalastyle:on magic.number
      val expected = 5
      val unpairedNumber = CollectionChallenges.findUnpairedElement(numbers)
      unpairedNumber mustEqual expected
    }

    "return 5 as the unpaired element on [4,3,2,1,5,1,2,3,4]" in {
      // scalastyle:off magic.number
      val numbers = Array(4, 3, 2, 1, 5, 1, 2, 3, 4)
      // scalastyle:on magic.number
      val expected = 5
      val unpairedNumber = CollectionChallenges.findUnpairedElement(numbers)
      unpairedNumber mustEqual expected
    }
  }

  "To find the tape equilibrium the function" should {
    "return 0 as the equilibrium on the tape [1,1]" in {
      val numbers = List(1, 1)
      val expected = 0
      val equilibrium = CollectionChallenges.findTapeEquilibrium(numbers)
      equilibrium mustEqual expected
    }

    "return 4 as the equilibrium on the tape [2,6]" in {
      // scalastyle:off magic.number
      val numbers = List(2, 6)
      // scalastyle:on magic.number
      val expected = 4
      val equilibrium = CollectionChallenges.findTapeEquilibrium(numbers)
      equilibrium mustEqual expected
    }

    "return 0 as the equilibrium on the tape [55,10,45]" in {
      // scalastyle:off magic.number
      val numbers = List(55, 10, 45)
      // scalastyle:on magic.number
      val expected = 0
      val equilibrium = CollectionChallenges.findTapeEquilibrium(numbers)
      equilibrium mustEqual expected
    }

    "return 1 as the equilibrium on the tape [3,1,2,4,3]" in {
      // scalastyle:off magic.number
      val numbers = List(3, 1, 2, 4, 3)
      // scalastyle:on magic.number
      val expected = 1
      val equilibrium = CollectionChallenges.findTapeEquilibrium(numbers)
      equilibrium mustEqual expected
    }

    "return 2000 as the equilibrium on the tape [-1000,1000]" in {
      // scalastyle:off magic.number
      val numbers = List(-1000, 1000)
      // scalastyle:on magic.number
      val expected = 2000
      val equilibrium = CollectionChallenges.findTapeEquilibrium(numbers)
      equilibrium mustEqual expected
    }
  }
}
