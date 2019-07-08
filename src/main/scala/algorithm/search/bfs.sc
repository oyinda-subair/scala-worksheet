class Graph[T] {
  type Vertex = T
  type GraphMap = Map[Vertex,List[Vertex]]
  var g:GraphMap = Map()

  def BFS(start: Vertex): List[List[Vertex]] = {

    def BFS0(elems: List[Vertex],visited: List[List[Vertex]]): List[List[Vertex]] = {
      val newNeighbors = elems.flatMap(g(_)).filterNot(visited.flatten.contains).distinct
      if (newNeighbors.isEmpty)
        visited
      else
        BFS0(newNeighbors, newNeighbors :: visited)
    }

    BFS0(List(start),List(List(start))).reverse
  }

  def DFS(start: Vertex): List[Vertex] = {

    def DFS0(v: Vertex, visited: List[Vertex]): List[Vertex] = {
      if (visited.contains(v))
        visited
      else {
        val neighbours:List[Vertex] = g(v) filterNot visited.contains
        neighbours.foldLeft(v :: visited)((b,a) => DFS0(a,b))
      }
    }
    DFS0(start,List()).reverse
  }

}

var sGraph = new Graph[String]
sGraph.g = Map("Apple" -> List ("Banana","Pear","Grape"), "Banana" -> List("Apple","Plum"), "Pear" -> List("Apple","Plum"), "Grape" -> List("Apple","Plum"), "Plum" -> List ("Banana","Pear","Grape"))
sGraph.BFS("Banana")
sGraph.DFS("Banana")


var newGraph = new Graph[String]
newGraph.g = Map(
  "f" -> List("d", "b", "a", "k", "l"),
  "d" -> List("f", "b", "e"),
  "e" -> List("d"),
  "b" -> List("a", "c"),
  "a" -> List("b"),
  "c" -> List("b"),
  "k" -> List("f", "g", "l", "h"),
  "l" -> List("k"),
  "g" -> List("h"),
  "h" -> List("g", "j"),
  "j" -> List("h","i"),
  "i" -> List("j"))

newGraph.BFS("f")
newGraph.DFS("f")