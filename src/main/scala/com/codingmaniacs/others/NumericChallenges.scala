package com.codingmaniacs.others

object NumericChallenges {

  /**
    * This method returns a sequence of strings that represents number that comply to certain conditions
    * For multiples of three replace the number with “Fizz”
    * For multiples of five replace the number with “Buzz”.
    * For numbers which are multiples of both three and five replace such number with “FizzBuzz
    * Don't replace other numbers
    *
    * @param s Sequence of numbers
    * @return Sequence of Strings containing the elements replaced where the condition applies.
    */
  def fizzBuzz(s: Seq[Int]): Seq[String] = {
    def fizzBuzzItem(number: Int): String =
      number match {
        case n if n % 3 == 0 && n % 5 == 0 => "FizzBuzz"
        case n if n % 3 == 0 => "Fizz"
        case n if n % 5 == 0 => "Buzz"
        case _ => number.toString
      }

    s.map(n => fizzBuzzItem(n))
  }

}
