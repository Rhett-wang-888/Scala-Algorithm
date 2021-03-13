import src.main.scala.ListNode

/**
 * ClassName HeapSort.java
 * author Rhett.wang
 * version 1.0.0
 * Description TODO 链表相加
 * createTime 2021年1月30日 15:38:00
 */

object AddTwoNumberLsit {
  def main(args: Array[String]): Unit = {

  }
  def addTwoNumberLsit(l1:ListNode,l2:ListNode):ListNode=(l1,l2) match{
      case (l1,null)=>l1
      case (null,l2)=>l2
      case (_,_)=>
           val d =(l1.x+l2.x)/10
           val r=(l1.x+l2.x)%10
           val ln =new ListNode(r)

           val next=if(d>0)
                    addTwoNumberLsit(new ListNode(1),addTwoNumberLsit(l1.next,l2.next))
                    else
                     addTwoNumberLsit(l1.next,l2.next)
           ln.next=next
           ln
  }

}
