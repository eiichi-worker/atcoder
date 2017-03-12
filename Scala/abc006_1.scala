/*
 * http://abc006.contest.atcoder.jp/tasks/abc006_1
 */

object Main {
  def main(args: Array[String]) = {
    val n = readLine.toInt

    val res = n%3 match {
      case 0  => "YES"
      case _  => "NO"
    }

    println(res)
  }
}
