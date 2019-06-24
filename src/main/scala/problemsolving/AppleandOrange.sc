
/*
  * Apple and Orange
  *
  * Sam's house has an apple tree and an orange tree that yield an abundance of fruit
  * When a fruit falls from its tree, it lands d units from its tree of origin along the x-axis.
  * A negative value of d means the fruit fell d units to the tree's left, and a positive value
  * of d means if falls d units to the tree's right
  *
  * Given the value of d for m apples and n oranges, determine how many apples and oranges will fall on Sam's house (i.e., in the inclusive range [s, t])?
  * For example, Sam's house is between  s = 7 and t = 10.
  * The apple tree is located at a = 4 and the orange at  b = 12.
  * There are m = 3 apples and n = 3 oranges.
  * Apples are thrown apples = [2, 3, -4] units distance from a, and oranges = [3, -2, -4] units distance.
  * Adding each apple distance to the position of the tree, they land at [4+2, 4+3, 4+-4] = [6,7,0].
  * Oranges land at [12+3, 12+-2, 12+-4] = [15, 10, 8]. One apple and two oranges land in the inclusive range 7-10 so we print
  * 1
  * 2
 */
// Complete the countApplesAndOranges function below.
def countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array[Int], oranges: Array[Int]) = {

  var appleCount = 0
  var orangeCount = 0

  apples.foreach{ apple ⇒ if ((apple + a) >= s && (apple + a) <= t) appleCount += 1}
  oranges.foreach{ orange ⇒ if ((orange + b) >= s && (orange + b) <= t) orangeCount += 1}
  

  println(appleCount)
  println(orangeCount)
}

val startPoint = 7
val endPoint = 10
val applePosition = 4
val orangePosition = 12
val apples = Array(2, 3, -4)
val oranges = Array(3, -2, -4)
//val startPoint = 7
//val endPoint = 11
//val applePosition = 5
//val orangePosition = 15
//val apples = Array(-2, 2, 1)
//val oranges = Array(5, -6)

countApplesAndOranges(startPoint, endPoint, applePosition, orangePosition, apples, oranges)