/*
 * http://abc001.contest.atcoder.jp/tasks/abc001_2
 */

object Main {
  def main(args: Array[String]) = {
    val m = readLine.toInt
    val km = m / 1000.0

    val res = km match {
      case km if m < 0.1                  => 0
      case km if 0.1  <= km && km <= 5.0  => km * 10
      case km if 6.0  <= km && km <= 30.0 => km + 50
      case km if 35.0 <= km && km <= 70.0 => ((km - 30) / 5) + 80
      case km if 70.0 <  km               => 89
      case _                              => 0
    }

    println("%02.0f".format(res))
  }
}
