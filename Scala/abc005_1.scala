/*
 * http://abc004.contest.atcoder.jp/tasks/abc004_1
 */

object Main {
  def main(args: Array[String]) = {
    val xyList = readLine.split(" ").map(_.toInt)

    println(xyList(1)/xyList(0))
  }
}
