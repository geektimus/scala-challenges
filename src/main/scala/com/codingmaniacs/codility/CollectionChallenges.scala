package com.codingmaniacs.codility

object CollectionChallenges {
  /**
    * Finds the missing positive integer that can occur on the array
    *
    * @param data Int Array
    * @return Missing Integer
    */
  def findMissingInt(data: Seq[Int]): Int = {
    val sortedSetWithIndex = data.sorted.distinct.zip(1 to data.size)
    sortedSetWithIndex match {
      case Nil => 1
      case List((x, y)) if x == y && x == 1 => 2
      case _ =>
        val dropped = sortedSetWithIndex.dropWhile {
          case (x, y) => x - y == 0
        }
        dropped.headOption match {
          case Some((_, y)) => y
          case None => sortedSetWithIndex.length + 1
        }
    }
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

    val maxDefaultTapeEq = 999999999

    val absMin: (Int, Int) => Int = (x: Int, y: Int) => {
      Math.abs(x - y)
    }

    var start = ns.head
    var end = ns.tail.sum
    var min = if (ns.length == 2) absMin(ns.head, ns.tail.head) else maxDefaultTapeEq

    for (i <- 1 to ns.length - 2) {
      val total = absMin(start, end)
      if (total < min) {
        min = total
      }
      start = ns(i) + start
      end = end - ns(i)
    }
    min
  }


}
