val a = Array(17, 28, 30)
val b = Array(99, 16, 8)
//
//val a = Array(5, 6, 7)
//val b = Array(3, 6, 10)

a.map(s ⇒ println(s))
val arr = List.empty[Int]
val brr = List.empty[Int]

def compare = {

  var aliceCount = 0
  var bobCount = 0

  if(a(0) > b(0)) aliceCount += 1
  else if(a(0) != b(0)) bobCount += 1

  if(a(1) > b(1)) aliceCount += 1
  else if(a(1) != b(1)) bobCount += 1

  if(a(2) > b(2)) aliceCount += 1
  else if(a(2) != b(2)) bobCount += 1

  val result = Array(aliceCount, bobCount)

  println(result.toList)
}