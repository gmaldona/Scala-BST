class BST {
  var headNode: Node = null

  def setHeadNode(node: Node): Unit = {
    headNode = node
  }

  def add(value: Int): Unit = {
    if (headNode == null) headNode = new Node(value, null)
    else headNode.add(value)
  }

  def addList(values: Array[Int]): Unit = for (value <- values) add(value)

  def search(value: Int): Boolean = headNode.search(value)
}
