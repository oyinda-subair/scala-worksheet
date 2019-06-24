/*
QuickSort, like merge sort QuickSort is a divide and conquer algorithm,
it picks an element as center point(pivot) and partitions the given array around the picked pivot.
Time Complexity - O(n log n) worst case - O(n^2)
Space complexity - O(log n)
*/

object QuickSort {

  def qSort(xs: List[Int]): List[Int] = {
    xs match {
      case Nil ⇒ Nil
      case head :: tail ⇒
        val (low, high) = tail.partition(_ < head)
        qSort(low) ::: head :: qSort(high)
    }
  }

  def sort(arr: Array[Int]): Array[Int] = {
    if(arr.length < 1) arr
    else {
      val pivot = arr(arr.length / 2)
      sort(arr filter(a ⇒ pivot > a)) ++
        (arr filter(a ⇒ pivot == a)) ++
        sort(arr filter(a ⇒ pivot < a))
    }
  }
}

val arr = List(38, 27, 43, 3, 9, 82, 10)

QuickSort.qSort(arr)
QuickSort.sort(arr.toArray)

QuickSort.qSort(List(33,44,22,-10,99))
QuickSort.qSort(List())
QuickSort.qSort(List.empty)