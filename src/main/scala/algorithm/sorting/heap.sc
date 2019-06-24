/*
Heap sort iis a comparision based sorting on Binary heap data structure.
It is similar to selection sort where we first find the maximum element
and place the maximum element at the end, butt it uses heap data
 */

object HeapSort {

  def left(i: Int) = (2 * i) + 1
  def right(i: Int) = left(i) + 1
  def parent(i: Int) = i / 2

  def heapSort(arr: Array[Int]) = {
    val n = arr.length

    buildHeap(arr, n)

    for(i ← arr.indices.reverse ) {
      swap(arr, 0, i)
      heapify(arr, i, 0)
    }
    arr
  }

  def buildHeap(arr: Array[Int], n: Int) ={
    for(i ← n / 2 to 0 by -1) {
      heapify(arr, n, i)
    }
  }

  def heapify(arr: Array[Int], n: Int, i: Int): Unit = {
    var largest = i
    val l = left(i)
    val r = right(i)

    if(l < n && arr(l) > arr(largest)) largest = l

    if(r < n && arr(r) > arr(largest)) largest = r

    if(largest != i) {
      swap(arr, i, largest)
      heapify(arr, n, largest)
    }
  }

  def swap(arr: Array[Int], i: Int, j: Int): Unit = {
    val temp = arr(i)
    arr(i) = arr(j)
    arr(j) = temp
  }
}

val data = Array (1,0,2,9,3,8,4,7,5,6)
HeapSort.heapSort(data)

val arr = Array(38, 27, 43, 3, 9, 82, 10)
HeapSort.heapSort(arr)