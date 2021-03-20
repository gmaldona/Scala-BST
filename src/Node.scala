class Node(val value: Int, var parentNode: Node) {

  var leftChild: Node = null
  var rightChild: Node = null


  def add(value: Int): Unit = {
    if (value < this.value) {
      if (this.leftChild == null) this.leftChild = new Node(value, this)
      else this.leftChild.add(value)
    }
    else {
      if (this.rightChild == null) this.rightChild = new Node(value, this)
      else this.rightChild.add(value)
    }
  }

  def getRightMostLeafNode(node: Node): Node = {
    if (rightChild == null) this
    else getRightMostLeafNode(rightChild)
  }
  def getLeftMostLeafNode(node: Node): Node = {
    if (leftChild == null) this
    else getLeftMostLeafNode(leftChild)
  }

  def search(value: Int): Boolean = {
    if (value == this.value) true
    else if (value < this.value)
      if (leftChild == null) false
      else leftChild.search(value)
    else
      if (rightChild == null) false
      else rightChild.search(value)
  }

}
