object main {
  def main(args: Array[String]): Unit = {
    val tree: BST = new BST()
    tree.add(6)
    tree.addList(Array(3, 10, 1, 0))
    println(tree.search(442))
  }
}
