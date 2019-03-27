package com.codingmaniacs.others

import org.specs2.mutable.Specification

class CollectionChallengesSpec extends Specification {
  "The slicer finder" should {

    "find the last index of a slice in an array of the same size" in {
      // scalastyle:off magic.number
      val s =  Array(3,4)
      val slice =  Array(3,4)
      // scalastyle:on magic.number
      val expected = 0
      val reverse = CollectionChallenges.lastIndexOfSlice(s, slice)
      reverse mustEqual expected
    }

    "find the last index of a slice in a small array" in {
      // scalastyle:off magic.number
      val s =  Array(7,2,3,4)
      val slice =  Array(3,4)
      // scalastyle:on magic.number
      val expected = 2
      val reverse = CollectionChallenges.lastIndexOfSlice(s, slice)
      reverse mustEqual expected
    }

    "find the last index of a slice big array" in {
      // scalastyle:off magic.number
      val s =  Array(7,2,3,4,6,9,3,4,6,21,8)
      val slice =  Array(3,4)
      // scalastyle:on magic.number
      val expected = 6
      val reverse = CollectionChallenges.lastIndexOfSlice(s, slice)
      reverse mustEqual expected
    }

    "find the last index of a slice on an array repeating the slice" in {
      // scalastyle:off magic.number
      val s =  Array(3,4,3,4,3,4,3,4,3,4,3,4)
      val slice =  Array(3,4)
      // scalastyle:on magic.number
      val expected = 10
      val reverse = CollectionChallenges.lastIndexOfSlice(s, slice)
      reverse mustEqual expected
    }
  }
}
