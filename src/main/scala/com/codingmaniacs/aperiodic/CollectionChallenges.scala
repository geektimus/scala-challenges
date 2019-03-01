package com.codingmaniacs.aperiodic

import scala.annotation.tailrec

object CollectionChallenges {

  def lastElement[T](itemList: List[T]): Option[T] = {
    itemList match {
      case Nil => None
      case last :: Nil => Some(last)
      case _ :: tail => lastElement(tail)
    }
  }

  def penultimate[T](itemList: List[T]): Option[T] = {
    itemList match {
      case Nil => None
      case head :: middle :: Nil => Some(head)
      case _ :: tail => penultimate(tail)
    }
  }

  def nthElement[T](nthPosition: Int, itemList: List[T]): Option[T] = {
    (nthPosition, itemList) match {
      case (pos, list) if pos > list.size => None
      case (_, Nil) => None
      case (0, l) => l.headOption
      case (pos, _ :: tail) => nthElement(pos - 1, tail)
    }
  }

  def length[T](itemList: List[T]): Int = {

    @tailrec
    def size(accum: Int, items: List[T]): Int = {
      items match {
        case Nil => accum
        case _ :: tail => size(accum + 1, tail)
      }
    }

    size(0, itemList)
  }

  def reverse[T](itemList: List[T]): List[T] = {
    itemList.foldLeft(List[T]())((accum, head) => head :: accum)
  }
}
