
/**
 * @description: TODO
 * @author Rhett.wang
 * @date 2020/9/6 10:43
 */
class LengthOfLongestSubstring{

}
object LengthOfLongestSubstring{
  def main(args: Array[String]): Unit = {
    print(lengthOfLongestSubstring("asdsfsd"))
  }
  def lengthOfLongestSubstring(s:String):Int={
    val len=s.length
    val map = scala.collection.mutable.HashMap[Char,Int]()
    var start =0
    var end= 0
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
    ans
  }
}