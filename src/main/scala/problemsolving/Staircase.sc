// Complete the staircase function below.
def staircase(m: Int, n: Int): Unit = {
  val ch: Char = '-'
  val builder = new StringBuilder()
  val str = "#"

  if (n > 0) {
    for (a ← 1 until n) {
      builder.append(ch)
    }
    builder.append(str * m)
    println(builder.toString)
    staircase(m + 1 , n - 1)
  }
}

var m = 1

def staircases(n: Int): Unit = {
  val ch: Char = ' '
  val builder = new StringBuilder()
  val str = "#"

  if (n > 0) {
    for (_ ← 1 until n) {
      builder.append(ch)
    }
    builder.append(str * m)
    m = m + 1
    println(builder.toString)
    staircases(n - 1)
  }
}