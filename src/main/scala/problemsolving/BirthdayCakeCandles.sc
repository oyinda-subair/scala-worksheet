val arr = Array(3, 2, 1, 3)
val arr2 = Array(4, 4, 1, 3, 3, 5)

// Complete the birthdayCakeCandles function below.
def birthdayCakeCandles(ar: Array[Int]): Int = {
  var count = 0
  var max = ar(0)

  for (a ← ar) {
    if (a > max) {
      max = a
      count = 1
    } else if (a == max) {
      count += 1
    }
  }

  count

  /*
  Using helper function

  val max = ar.max
  ar.count(_ == max)
   */
}

birthdayCakeCandles(arr2)