/*
 * http://arc001.contest.atcoder.jp/tasks/arc001_1
 */

object Main {
  def main(args:Array[String]) = {
    val n = readLine.toInt
    val cList = readLine.split("").map(_.toInt)
    var answerList = new Array(4)
    println(n)
    cList.foreach(println)

    cList.map(answerList(x-1)+=1)

    println(n)
    answerList.foreach(println)

//    print(())print+" "+s+"\n")
  }
}
