/*
 * http://abc003.contest.atcoder.jp/tasks/abc003_1
 */

object Main {
  def main(args: Array[String]) = {
    val n = readLine.toInt

    println((1 to n).toList.map(x => x*10000*(1/n.toFloat)).sum.toInt)
  }
}
