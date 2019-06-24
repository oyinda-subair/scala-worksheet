import java.text.DecimalFormat

def precision(value: Double) = {
  val formatter = new DecimalFormat("0.000000")
  formatter.format(value)
}

val plusMinusZero = Array(-4, 3, -9, 0, 4, 1)
def plusMinus(arr: Array[Int]): Unit = {
  val n = arr.length

  var positive = 0
  var negative = 0
  var zero = 0

  for (i ← plusMinusZero){
    if(i > 0) positive += 1
    if(i < 0) negative +=1
    if(i == 0) zero += 1
  }

  println(precision(positive.toDouble/n.toDouble))
  println(precision(negative.toDouble/n.toDouble))
  println(precision(zero.toDouble/n.toDouble))
}