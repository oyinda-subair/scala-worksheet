
val arr = Array(1, 2, 3, 4, 5)
val arr2 = Array(1, 3, 5, 7, 9)
val arr3 = Array(7, 69, 2, 221, 8974)
// output 2063136757 2744467344
val arr4 = Array(256741038, 623958417, 467905213, 714532089, 938071625)

// Complete the miniMaxSum function below.
def miniMaxSum(arr: Array[Int]) = {
  var sum = BigInt(0)

  var minCount = Integer.MAX_VALUE
  var maxCount = 0


  for(a ← arr) {
    sum += BigInt(a) // convert element to BigInt before summing up, figure out why large numbers summation return a negative value

    if(a <= minCount) minCount = a
    if(a >= maxCount) maxCount = a

  }

  println(s"${sum - maxCount} ${sum - minCount}")
}

//miniMaxSum(arr4)

def miniMaxSum3(arr: Array[Int]): Unit = {
  var minCount = BigInt(Integer.MAX_VALUE)
  var maxCount = BigInt(0)

  for(a ← arr.indices.dropRight(1)) {
    val sum = arr.zipWithIndex.filter(_._2 != a).map(s ⇒ BigInt(s._1)).sum
    if (sum < minCount) minCount = sum
    if (sum > maxCount) maxCount = sum
  }

  println(s"$minCount $maxCount")
}

miniMaxSum3(arr4)

def miniMaxSum4(arr: Array[Int]) = {
  val sortedArr = arr.sorted
//  val mini = sortedArr(0) + sortedArr(1) + sortedArr(2) + sortedArr(3)
//  val max = sortedArr(1) + sortedArr(2) + sortedArr(3) + sortedArr(4)
  val mini = BigInt(arr.sum) - BigInt(arr.max)
  val max = BigInt(arr.sum) - BigInt(arr.min)

  println(BigInt(sortedArr.sum))
  println(s"sum: ${arr.sum} - min: ${arr.min}")

  println(s"$mini $max")
}

//miniMaxSum4(arr4)

