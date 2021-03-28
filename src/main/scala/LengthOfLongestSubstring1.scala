
/**
 * ClassName LengthOfLongestSubstring1.java
 * author Rhett.wang
 * version 1.0.0
 * Description TODO w无重复字符的最长字符
 * createTime 2021年3月28日 15:38:00
 */

object LengthOfLongestSubstring1 {
  def main(args: Array[String]): Unit = {

  }
  def lengthOfLongestSubstring2(s:String):Int={
    val len=s.length
    val map=scala.collection.mutable.HashMap[Char,Int]()

    var start=0
    var end=0
    var ans=0
    while (end<len){
      val alpha=s(end)
      if(map.contains(alpha)){
        start=math.max(map(alpha),start)
      }
      ans=math.max(ans,end-start+1)
      map.put(s(end),end+1)
      end +=1
    }

    return ans
  }

}
