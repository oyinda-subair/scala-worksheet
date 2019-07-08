import sun.security.provider.certpath.Vertex

class GraphObj[T] {
  type Vertex = T
  type GraphMap = Map[Vertex,List[Vertex]]
  var g:GraphMap = Map()

  /*
  Pick a starting node and push all its adjacent nodes into a stack.
  Pop a node from stack to select the next node to visit and push all its adjacent nodes into a stack.
  Repeat this process until the stack is empty. However, ensure that the nodes that are visited are marked.
  This will prevent you from visiting the same node more than once.
  If you do not mark the nodes that are visited and you visit the same node more than once, you may end up in an infinite loop.
   */
  def dfsIterative(start: Vertex) = {
    var s = Array.empty[String]
    s :+ start

    while(s.nonEmpty) {

      val vertex = s.head
    }
  }

  def dfsRecursive(node: Vertex, visited: Array[Vertex]) = {
    if(visited.contains(node)) visited
    else {
      visited :+ node
    }
  }
}

var sGraph = new GraphObj[String]
sGraph.g = Map("Apple" -> List ("Banana","Pear","Grape"), "Banana" -> List("Apple","Plum"), "Pear" -> List("Apple","Plum"), "Grape" -> List("Apple","Plum"), "Plum" -> List ("Banana","Pear","Grape"))

sGraph.dfsRecursive("Array", Array())

/*
DFS-iterative (G, s):                                   //Where G is graph and s is source vertex
      let S be stack
      S.push( s )            //Inserting s in stack
      mark s as visited.
      while ( S is not empty):
          //Pop a vertex from stack to visit next
          v  =  S.top( )
         S.pop( )
         //Push all the neighbours of v in stack that are not visited
        for all neighbours w of v in Graph G:
            if w is not visited :
                     S.push( w )
                    mark w as visited

 */

/*
 DFS-recursive(G, s):
        mark s as visited
        for all neighbours w of s in Graph G:
            if w is not visited:
                DFS-recursive(G, w)
 */