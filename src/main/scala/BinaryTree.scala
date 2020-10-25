/**
 * @description: TODO
 * @author Rhett.wang
 * @date 2020/9/6 10:43
 */
class BinaryTree {

}
object BinaryTree{
  def main(args: Array[String]): Unit = {

  }
  def preorderTraversal(root:TreeNode):List[Int]={
    var res =List[Int]()
    if(root==null) return List[Int]()
    res=res:::List[Int](root._value)
    res=res:::preorderTraversal(root.left)
    res=res:::preorderTraversal(root.right)
    res
  }
  def inorderTraversal(root:TreeNode):List[Int]={
    if(root==null) List.empty[Int]
    else inorderTraversal(root.left) ++List(root._value)++inorderTraversal(root.right)
  }
  def inSymmetric(root:TreeNode):Boolean={
    isMirror(root.right,root.left)
  }
  def isMirror(node: TreeNode, node1: TreeNode):Boolean={
    if(node==null && node1==null)true
    if(node==null || node1==null)false
    node._value==node1._value &&isMirror(node.left,node1.right)&& isMirror(node.right,node1.left)
  }

}
class TreeNode(var _value:Int){
  var value:Int =_value
  var left:TreeNode=null
  var right:TreeNode=null
}