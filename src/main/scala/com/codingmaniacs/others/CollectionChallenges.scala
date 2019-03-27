package com.codingmaniacs.others

import scala.annotation.tailrec

object CollectionChallenges {
  def lastIndexOfSlice(array: Array[Int], slice: Array[Int]): Int = {
    @tailrec
    def lastIndexSeen(a: List[Int], s: List[Int]): List[Int] = {
      (a, s) match {
        case (List(), List()) => List()
        case (ls, List()) => ls
        case (ina :+ enda, ins :+ ends) if enda == ends => lastIndexSeen(ina, ins)
        case (ina :+ _, _) => lastIndexSeen(ina, s)
      }
    }

    lastIndexSeen(array.toList, slice.toList).length
  }

}
