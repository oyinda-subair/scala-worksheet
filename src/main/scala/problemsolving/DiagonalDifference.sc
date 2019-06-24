import scala.collection.mutable.ArrayBuffer

var c: Array[Array[Int]]  = Array.ofDim[Int](3,3)
c = Array(Array(0, 2, 3), Array(1, 5, 0), Array(0, 9, 7))
val d: Array[Array[Int]] = Array(Array(0, 1, 2), Array(1, 2, 3), Array(2, 3, 4))

def diagonalDifference(arr: Array[Array[Int]]): Int = {
  val firstDi = ArrayBuffer[Int]()
  val secondDi = ArrayBuffer[Int]()
  val n = arr.length
  val m = arr.length - 1

  for(i <- 0 until n) {

    firstDi :+ c(i)(i)
    secondDi :+  c(m - i)(i)
  }
  println(Math.abs(firstDi.sum - secondDi.sum))
  Math.abs(firstDi.sum - secondDi.sum)
}

