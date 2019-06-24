
/*
  *You are choreograhing a circus show with various animals.
  * For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).
  * The first kangaroo starts at location and moves at a rate of meters per jump.
  * The second kangaroo starts at location and moves at a rate of meters per jump.
  * You have to figure out a way to get both kangaroos at the same location as part of the show.
  * Complete the function kangaroo which takes starting location and speed of both kangaroos as input, and return or appropriately.
  * Can you determine if the kangaroos will ever land at the same location at the same time?
  * The two kangaroos must land at the same location after making the same number of jumps.
  *
 */

// Complete the kangaroo function below.
def kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String = {
  val yes = "YES"
  val no = "NO"

  if (x1 + v1 == x2 + v2) yes
  else if (x2 > x1 && v2 > v1) no
  else if ((x1 - x2).toDouble % (v2 - v1).toDouble == 0.toDouble ) yes // convert to double to avoid division by zero rule see https://stackoverflow.com/a/43938475/4186581
  else no
}
// 43 2 70 2
val x1 = 43
val v1 = 2
val x2 = 70
val v2 = 2

kangaroo(x1, v1, x2, v2)
