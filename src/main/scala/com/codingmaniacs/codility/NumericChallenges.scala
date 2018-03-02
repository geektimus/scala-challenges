package com.codingmaniacs.codility

object NumericChallenges {
  /**
    * Finds the binary gap of the given number
    * Binary gap is the max number of consecutive zeros between ones on the binary representation of the number.
    *
    * @param n number
    * @return Integer representing the binary gap on the given number.
    */
  def findBinaryGap(n: Int): Int = {
    val binary = n.toBinaryString
    val res = binary.substring(0, binary.lastIndexOf("1")).split("1")
    res.map(_.length).reduceOption(_ max _).getOrElse(0)
  }
}
