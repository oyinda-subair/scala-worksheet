/*
Merge Sort is a divide and conquer algorithm, it divides input array in two halves.
calls itself for the two halves and then merges the two sorted halves.
Time Complexity - O(n log n)
Space Complexity - O(n lon n)
  MergeSort(arr[], l,  r)
  If r > l
       1. Find the middle point to divide the array into two halves:
               middle m = (l+r)/2
       2. Call mergeSort for first half:
               Call mergeSort(arr, l, m)
       3. Call mergeSort for second half:
               Call mergeSort(arr, m+1, r)
       4. Merge the two halves sorted in step 2 and 3:
               Call merge(arr, l, m, r)
 */

object MergeSort {

  def mergeSort(arr: List[Int]): List[Int] = {
    val middle = arr.length / 2

    if (middle == 0) arr
    else {
      val (left, right) = arr.splitAt(middle)
      merge(mergeSort(left), mergeSort(right))
    }
  }

  def merge(left: List[Int], right:List[Int]): List[Int] = {
    (left, right) match {
      case (Nil, xs) ⇒ xs
      case (ys, Nil) ⇒ ys
      case(x :: xsl, y :: ysl) ⇒
        if (x < y) x::merge(xsl, right) else y :: merge(left, ysl)
    }
  }
}

val arr = List(38, 27, 43, 3, 9, 82, 10)
MergeSort.mergeSort(arr)
MergeSort.mergeSort(List(33,44,22,-10,99))
MergeSort.mergeSort(List())
MergeSort.mergeSort(List.empty)
