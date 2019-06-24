/*
Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands
Time complexity - O(n*2)
Space complexity - O(1)
// Sort an arr[] of size n
insertionSort(arr, n)
    Loop from i = 1 to n-1.
       a) Pick element arr[i] and insert
          it into sorted sequence arr[0..i-1]
 */

object InsertionSort {
  def sort(arr: Array[Int]): Array[Int] = {

    for(i ← 1 until arr.length) {
      val key = arr(i)
      var j = i - 1

      while (j >= 0 && arr(j) > key) {
        arr(j+1) = arr(j)
        j = j - 1
      }
      arr(j+1) = key
    }
    arr
  }

  def recursiveSort(arr: Array[Int], n: Int): Array[Int] ={
    if(n <= 1) arr
    else {
      recursiveSort(arr, n - 1)
      val last = arr(n-1)
      var j = n-2

      while (j >= 0 && arr(j) > last) {
        arr(j+1) = arr(j)
        j = j - 1
      }
      arr(j+1) = last
    }
    arr
  }
}

val arr = Array(38, 27, 43, 3, 9, 82, 10)
InsertionSort.sort(arr)
InsertionSort.recursiveSort(arr, arr.length)
InsertionSort.recursiveSort(Array(33,44,22,-10,99), 5)