package com.codingmaniacs.codility

import scala.annotation.tailrec

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
      case Seq((x, y)) if x == y && x == 1 => 2
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
  def findTapeEquilibrium(ns: List[Int]): Int = {

    val minus = (a: Int, b: Int) => Math.abs(a - b)

    @tailrec
    def findEquilibrium(min: Int, a: List[Int], b: List[Int]): Int = {
      b match {
        case List() => min
        case List(el) => min
        case h :: tail =>
          val newMin = Math.min(min, minus((a ::: List(h)).sum, tail.sum))
          findEquilibrium(newMin, a ::: List(h), tail)
      }
    }

    findEquilibrium(Int.MaxValue, List(), ns)
  }


}
