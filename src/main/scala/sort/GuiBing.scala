package sort

import src.main.scala.ListNode

/**
 * @author Rhett
 * @title: RemoveNthFromEnd
 * @description: TODO 链表归并排序
 * @date 2021/10/18 14:58
 */
object GuiBing {

  def sortList(head:ListNode):ListNode={
    var dummyHead=new ListNode()
    dummyHead.next=head
    if(head==null)
      return head
    var l1tail=head
    var l2=head.next
    head.next=null
    while(l2 !=null){
      if(l2.x<l1tail.x){
        var pre=dummyHead
        var cur=dummyHead.next
        while(cur.x<=l2.x){
          pre=cur
          cur=cur.next
        }
        var t=l2.next
        pre.next=l2
        l2.next=cur
        l2=t
      }else{
        l1tail.next=l2
        l2=l2.next
        l1tail=l1tail.next
        l1tail.next=null
      }
    }
    return dummyHead.next
  }
  def sortList1(head:ListNode):ListNode={


    return null

  }

}
