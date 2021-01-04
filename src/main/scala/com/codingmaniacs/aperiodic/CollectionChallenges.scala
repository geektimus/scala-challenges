package com.codingmaniacs.aperiodic

import scala.annotation.tailrec

object CollectionChallenges {

  @tailrec
  def lastElement[T](itemList: List[T]): Option[T] =
    itemList match {
      case Nil         => None
      case last :: Nil => Some(last)
      case _ :: tail   => lastElement(tail)
    }

  @tailrec
  def penultimate[T](itemList: List[T]): Option[T] =
    itemList match {
      case Nil             => None
      case head :: List(_) => Some(head)
      case _ :: tail       => penultimate(tail)
    }

  @tailrec
  def nthElement[T](n: Int, ls: List[T]): Option[T] =
    (n, ls) match {
      case (0, h :: _)      => Some(h)
      case (pos, _ :: tail) => nthElement(pos - 1, tail)
      case _                => None
    }

  def length[T](itemList: List[T]): Int = {

    @tailrec
    def size(accum: Int, items: List[T]): Int =
      items match {
        case Nil       => accum
        case _ :: tail => size(accum + 1, tail)
      }

    size(0, itemList)
  }

  val lengthWithFold: List[_] => Int = (ls: List[_]) => ls.foldLeft(0)((accum, _) => accum + 1)

  def reverse[T](itemList: List[T]): List[T] = itemList.foldLeft(List[T]())((accum, head) => head :: accum)

  def isPalindrome[T](list: List[T]): Boolean = {

    @tailrec
    def isPalindromeRec(rs: Boolean, ls: List[T]): Boolean =
      ls match {
        case Nil         => rs
        case List(_)     => rs
        case (h :: tail) => isPalindromeRec(rs && (h == tail.last), tail.dropRight(1))
      }

    isPalindromeRec(rs = true, list)

  }

  def flatten(ls: List[Any]): List[Any] = {

    @tailrec
    def flat(rs: List[Any], rem: List[Any]): List[Any] =
      rem match {
        case Nil                  => rs
        case (h: List[_]) :: Nil  => flat(rs, h)
        case (h: List[_]) :: tail => flat(rs ::: h, tail)
        case h :: tail            => flat(rs ::: List(h), tail)
      }

    flat(List(), ls)
  }

  def compress[T](elements: List[T]): List[T] = {

    @tailrec
    def reduceList(res: List[T], ls: List[T]): List[T] =
      (res, ls) match {
        case (_, Nil)                      => res
        case (_ :+ l, h :: tail) if l == h => reduceList(res, tail)
        case (_, h :: tail)                => reduceList(res ::: List(h), tail)
      }

    reduceList(List(), elements)
  }

  def compressWithFold[T](elements: List[T]): List[T] =
    elements.foldLeft(List[T]()) {
      case (List(), el)                                  => List(el)
      case (ls, el) if ls.lastOption.getOrElse(()) == el => ls
      case (ls, el)                                      => ls ::: List(el)
    }

  def pack[A](elements: List[A]): List[List[A]] = {

    @tailrec
    def packList(res: List[List[A]], rem: List[A]): List[List[A]] =
      rem match {
        case Nil => res
        case _ =>
          val (s: List[A], r: List[A]) = rem span {
            _ == rem.headOption.getOrElse(())
          }
          packList(res ::: List(s), r)
      }

    packList(List(), elements)
  }

  def recursiveEncode[T](elements: List[T]): List[(Int, T)] = {

    @tailrec
    def encodeList(res: List[(Int, T)], els: List[List[T]]): List[(Int, T)] =
      els match {
        case Nil => res
        case h :: tail =>
          h match {
            case Nil     => res
            case h1 :: _ => encodeList(res ::: List((h.length, h1)), tail)
          }
      }

    encodeList(List(), pack(elements))
  }

  def composableEncode[T](packedList: List[List[T]]): List[(Int, T)] =
    packedList match {
      case Nil => Nil
      case h :: tail =>
        h match {
          case Nil     => Nil
          case h1 :: _ => (h.length, h1) :: composableEncode(tail)
        }
    }

  def encodeComposed[T]: List[T] => List[(Int, T)] = pack[T] _ andThen composableEncode[T]
}
