/**
 * @author Rhett
 * @title: ReverseLinkedList
 * @description: TODO 指定位置进行 翻转链表
 * @date 2021/5/15 13:47
 */

object ReverseLinkedList {

  def main(args: Array[String]): Unit = {

  }

  def reverseBetween(head:ListNode ,m:Int,n:Int):ListNode={
    var cur:ListNode=head
    var next:ListNode=null
    var pre:ListNode =null
    var htail:ListNode =null
    var thead:ListNode =null

    var i=1
    while(i<n+1){
      if(i>=m && i<=n){
        next=cur.next
        cur.next=pre
        pre=cur
        cur=next
        if(i==n){
          thead=cur
          if(htail!=null){
            htail.next.next=thead
            htail.next=pre
          }else{
            head.next=thead
          }
        }
      }else{
        if(i==m-1){
          htail=cur

        }
        cur=cur.next
      }
      i+=1

    }
    if(htail==null) pre else head
  }

  def reverseBetween1(head:ListNode,m:Int,n:Int):ListNode={
    val dummy=new ListNode(-1)
    var p=dummy
    dummy.next=head
    (0 until (m-1)).foreach(_=>p=p.next)
    val cur=p.next
    (m until n).foreach(_=>{
      val tmp=cur.next
      cur.next=tmp.next
      tmp.next=p.next
      p.next=tmp
    })
    dummy.next
  }
}
