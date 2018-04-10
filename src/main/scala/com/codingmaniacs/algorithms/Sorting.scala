package com.codingmaniacs.algorithms

object Sorting {
  /**
    * Merge sort O(n log n)
    *
    * @param ns Array of numbers
    * @return Array of numbers sorted
    */
  def mergeSort(ns: Array[Int]): Array[Int] = {

    /**
      * Splits an array in "half" returning each split in a tuple
      *
      * @param ns Array of numbers
      * @return A tuple containing the values before and after the "middle"
      */
    def split(ns: Array[Int]): (Array[Int], Array[Int]) = {
      if (ns.length == 1) {
        (Array(ns.head), Array())
      } else {
        val middle = Math.floor(ns.length / 2)
        ns.splitAt(middle.toInt)
      }
    }

    /**
      * Merges two arrays taking the elements from a and b in order
      *
      * @param a Array of numbers [Sorted]
      * @param b Array of numbers [Sorted]
      * @return An array of numbers sorted after the merge
      */
    def stitch(a: Array[Int], b: Array[Int]): Array[Int] = {
      if (a.length == 0)
        return b
      if (b.length == 0)
        return a

      if (a.head < b.head) {
        Array(a.head) ++ stitch(a.tail, b)
      } else {
        Array(b.head) ++ stitch(a, b.tail)
      }
    }

    if (ns.length < 2) {
      ns
    } else {
      val s = split(ns)
      stitch(mergeSort(s._1), mergeSort(s._2))
    }
  }

  /**
    * Bubble Sort O(n&#94;2)
    *
    * @param ns Array of numbers
    * @return Array of numbers sorted
    */
  def bubbleSort(ns: Array[Int]): Array[Int] = {
    for (i <- ns.indices) {
      for (j <- 0 to ns.length - i - 2) {
        if (ns(j) > ns(j + 1)) {
          val tmp = ns(j)
          ns(j) = ns(j + 1)
          ns(j + 1) = tmp
        }
      }
    }
    ns
  }

  /**
    * Insertion Sort
    * Two loops means O(n&#94;2)
    * However since if your list is sorted or nearly so, it can be O(n) in a best case scenario and thus well
    * adapted to that scenario
    *
    * @param ns Array of numbers sorted or nearly sorted
    * @return Array of numbers sorted
    */
  def insertionSort(ns: Array[Int]): Array[Int] = {
    for (i <- 1 until ns.length) {
      if (ns(i - 1) > ns(i)) {
        // Find a place for the value of ns at i - 1
        var j = i - 1
        val value = ns(i)
        while (j >= 0 && value < ns(j)) {
          ns(j + 1) = ns(j)
          j -= 1
        }
        ns(j + 1) = value
      }
    }
    ns
  }
}
