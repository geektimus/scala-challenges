package com.codingmaniacs.hackerrank

import scala.annotation.tailrec

object CollectionChallenges {

  def findNumber(arr: Array[Int], k: Int): String = {

    @tailrec
    def findK(ls: List[Int], n: Int) : String = {
      ls match {
        case Nil => "NO"
        case h :: _ if h == n => "YES"
        case _ :: tail => findK(tail, n)
      }
    }

    findK(arr.toList, k)
  }

  def findNumbers(start: Int, end: Int, predicate: Int => Boolean) : Array[Int] = {
    def findNumbersRec(res: List[Int], rem: List[Int], predicate: Int => Boolean) : Array[Int] = {
      rem match {
        case Nil => res.toArray
        case h :: tail if predicate(h) => findNumbersRec(res ::: List(h), tail, predicate)
        case _ :: tail => findNumbersRec(res, tail, predicate)
      }
    }

    findNumbersRec(List(), (start to end).toList, predicate)
  }

  def oddNumbers(start: Int, end: Int): Array[Int] = {
    def oddPredicate(h: Int) : Boolean = {
      h % 2 != 0
    }
    findNumbers(start, end, oddPredicate)
  }
}
