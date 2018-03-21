package com.codingmaniacs.hackerrank

object StringChallenges {
  def reduceByPairs(s: String): String = {
    var r = s
    val re = "(\\w)\\1{1}".r
    var m = re.findAllIn(r)
    while (m.hasNext) {
      r = re.replaceAllIn(r, "")
      m = re.findAllIn(r)
    }
    r match {
      case str if str.length > 0 => str
      case _ => "Empty String"
    }
  }

}
