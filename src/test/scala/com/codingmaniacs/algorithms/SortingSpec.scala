package com.codingmaniacs.algorithms

import org.specs2.mutable._

class SortingSpec extends Specification {
  "The merge sort" should {
    "sort an empty array" in {
      val res = Sorting.mergeSort(Array[Int]())
      res mustEqual Array[Int]()
    }
    "sort an array with one element" in {
      val arr = Array(100)
      val expected = Array(100)
      val res = Sorting.mergeSort(arr)
      res mustEqual expected
    }
    "sort an array with two elements" in {
      val arr = Array(100, 10)
      val expected = Array(10, 100)
      val res = Sorting.mergeSort(arr)
      res mustEqual expected
    }
    "sort an array with ten elements (partially sorted)" in {
      val arr = Array(1, 2, 3, 5, 4, 6, 7, 8, 10, 9)
      val expected = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
      val res = Sorting.mergeSort(arr)
      res mustEqual expected
    }
    "sort an array with ten elements (in reverse order)" in {
      val arr = Array(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
      val expected = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
      val res = Sorting.mergeSort(arr)
      res mustEqual expected
    }
  }
}
