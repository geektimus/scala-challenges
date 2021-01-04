package com.codingmaniacs.others

import scala.annotation.tailrec

object CollectionChallenges {

  def lastIndexOfSlice(array: Array[Int], slice: Array[Int]): Int = {

    type Index = Int

    @tailrec
    def lastIndexSeen(lastIndex: Index, a: Seq[Int], s: Seq[Int]): Index =
      (a, s) match {
        case (Nil, _)                                   => lastIndex
        case (_, Nil)                                   => lastIndex
        case (ina :+ endA, ins :+ endS) if endA == endS => lastIndexSeen(lastIndex + 1, ina, ins)
        case (ina :+ _, _)                              => lastIndexSeen(lastIndex + 1, ina, s)
        case (_, _)                                     => lastIndex
      }

    array.length - lastIndexSeen(0, array.toSeq, slice.toSeq)
  }

}
