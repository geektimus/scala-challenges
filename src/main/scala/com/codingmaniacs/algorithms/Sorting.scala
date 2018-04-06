package com.codingmaniacs.algorithms

object Sorting {
  /**
    * Merge sort
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
}
