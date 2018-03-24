package com.codingmaniacs.codility

object CollectionChallenges {
  /**
    * Finds the missing positive integer that can occur on the array
    *
    * @param data Int Array
    * @return Missing Integer
    */
  def findMissingInt(data: Array[Int]): Int = {
    if (data == null || data.length == 0)
      return 1

    val arr = data.filter(n => n > 0).distinct.sorted

    if (arr.isEmpty || arr(0) > 1)
      return 1

    val res = arr
      .zipWithIndex
      .map(el => (el._1, el._2 + 1))
      .dropWhile(el => el._1 - el._2 == 0)

    if (res.isEmpty)
      arr.last + 1
    else
      res.head._2
  }

  /**
    * Finds the unpaired element on a given array of odd length (only one unpaired element)
    *
    * @param ns Number array
    * @return The unpaired element on the array
    */
  def findUnpairedElement(ns: Array[Int]): Int = {
    ns.foldLeft(0)((x, y) => x ^ y)
  }

  /**
    * Finds the minimum difference (Tape Equilibrium) on an array
    *
    * @param ns Number array (Tape)
    * @return the minimum difference on an array
    */
  def findTapeEquilibrium(ns: Array[Int]): Int = {

    val absMin: (Int, Int) => Int = (x: Int, y: Int) => {
      Math.abs(x - y)
    }

    var start = ns.head
    var end = ns.tail.sum
    var min = if (ns.length == 2) absMin(ns.head, ns.tail.head) else 999999999

    for (i <- 1 to ns.length - 2) {
      val total = absMin(start, end)
      if (total < min)
        min = total
      start = ns(i) + start
      end = end - ns(i)
    }
    min
  }


}
