
/*
     * Complete the getTotalX function below.
     * You will be given two arrays of integers and asked to determine all integers that satisfy the following two
  conditions:
    1. The elements of the first array are all factors of the integer being considered
  2. The integer being considered is a factor of all elements of the second array
     */
def getTotalX(a: Array[Int], b: Array[Int]): Int = {
  /*
   * Write your code here.
   */

  val allNumbers = (a.max to b.min).toList

  println(allNumbers)

  val x = allNumbers.filter(num => a.forall(i => num % i == 0) && b.forall(j => j % num == 0))
  println(x.size)

  x.size

}
val arr1 = Array(2, 4)
val arr2 = Array(16, 32, 96)
getTotalX(arr1, arr2)

/*O(n log(n)) solution.
1. find the LCM of all the integers of array A.
2. find the GCD of all the integers of array B.
3. Count the number of multiples of LCM that evenly divides the GCD.*/

//def gcd(numbers: Vector[Int]): Int = numbers reduce gcd
//
//def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
//
//def lcm(numbers: Vector[Int]): Int = {
//  def lcm(a: Int, b: Int) = {
//    val g = gcd(a, b)
//    if (g == 0) 0 else a * b / g
//  }
//  numbers reduce lcm
//}

//object GCD
//{
//  def gcd(a: Int,b: Int): Int = {
//    if(b ==0) a else gcd(b, a%b)
//  }
//
//  def main(args: Array[String]) {
//    println(gcd(25,15))
//  }
//}
//
//object LeastCommonMultiple {
//
//  def lcm(a: BigInt, b: BigInt): BigInt = a * b / a.gcd(b)
//
//  def main(args: Array[String]): Unit = {
//    println(lcm(3, 4))
//  }
//}