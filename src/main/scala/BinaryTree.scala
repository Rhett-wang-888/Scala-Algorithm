import scala.annotation.tailrec

/**
 * @description: TODO 二分查找的方法
 * @author Rhett.wang
 * @date 2020/8/30 19:18
 */
object BinaryTree {
  def main(args: Array[String]): Unit = {
    var result =binarySearch1(List(1,22,13,4,5,6,7,8).sorted,4)
     println(result)
  }
  def binarySearch(arr:List[Int],elem:Int,fromIndex:Int,toIndex:Int):Int={
    @tailrec
    def searchImpl(lo:Int,hi:Int):Int={
      if(lo>hi)
        -1
      else{
        var mid:Int=lo+(hi-lo)/2
        arr(mid) match {
          case mvs if(mvs==elem)=>mid
          case mvs if(mvs<=elem)=>searchImpl(mid+1,hi)
          case _=>searchImpl(lo,mid-1)
        }
      }

    }
    searchImpl(fromIndex,toIndex-1)
  }
   def binarySearch1(arr:List[Int],elem:Int):Int={
     binarySearch(arr,elem,0,arr.length)
   }


}
