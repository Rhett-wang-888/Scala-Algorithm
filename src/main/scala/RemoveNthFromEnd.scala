import javax.management.ListenerNotFoundException

/**
 * @author Rhett
 * @title: RemoveNthFromEnd
 * @description: TODO 删除链表倒数第n个节点
 * @date 2021/5/9 15:48
 */
class ListNode(_x:Int=0,_next:ListNode =null){
  var next:ListNode =_next
  var  x:Int=_x
}

object RemoveNthFromEnd {
  def main(args: Array[String]): Unit = {

  }
  def removeNthFromEnd1(head:ListNode,n:Int):ListNode={
    val dummy =new ListNode(0)
    dummy.next=head
    var first=dummy
    var second =dummy
    for(i<- 1 to n+1){
      first=first.next
    }
    while(first!=null){
      first=first.next
      second=second.next
    }
    second.next=second.next.next
    dummy.next
  }

  def removeNthFromEnd(head:ListNode,n:Int):ListNode={
    val beforeHead=new ListNode()
    beforeHead.next=head
    val stack=scala.collection.mutable.Stack[ListNode]()
    stack.push(beforeHead)
    var idx=head
    while(idx!=null){
      stack.push(idx)
      idx=idx.next
    }
    var   count=n
    while(count>=2){
      stack.pop()
      count-=1
    }
    if(stack.length==1)return null
    val removed=stack.pop()
    val beforeRemoved=stack.top

    beforeRemoved.next=removed.next
    beforeHead.next
  }

  def removeNthFromEnd2(head:ListNode,n:Int):ListNode={
    val beforeHead=new ListNode()
    beforeHead.next=head
    val stack=scala.collection.mutable.Stack[ListNode]()
    stack.push(beforeHead)

    var idx=head
    while (idx !=null){
      stack.push(idx)
      idx=idx.next
    }

    var count=n
    while(count>=2){
      stack.pop()
      count -=1
    }
    if(stack.length==1)return null
    val removed=stack.pop()
    val beforeRemoved=stack.top
    beforeRemoved.next=removed.next

    beforeHead.next
  }
  def removeNthFromEnd3(head:ListNode,n:Int):ListNode={
    val dummy=new ListNode(0)
    dummy.next=head
    var first=dummy
    var second=dummy

    for(i<-1 to n+1){
      first=first.next
    }
    while(first !=null){
      first=first.next
      second=second.next
    }
    second.next=second.next.next

    dummy.next
  }
}
