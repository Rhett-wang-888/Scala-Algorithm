/**
 * @author Rhett
 * @title: HuiWen
 * @description: TODO 给定一个字符串，分割成回文串
 * @date 2021/3/7 14:11
 */

object HuiSu {
  def main(args: Array[String]): Unit = {

  }

  def partition(s:String):List[List[String]]={
    if (s==" ") return List(List())
    import scala.collection.mutable.Buffer
    val dp=Array.ofDim[Boolean](s.length()+1,s.length+1)
    s.toCharArray()
    (0 until s.length).foreach(dp(0)(_)=true)
    (0 until s.length).foreach(dp(1)(_)=true)
    (2 to s.length).foreach(lv=>{
      (0 to s.length-lv).foreach(pos=>{
        dp(lv)(pos)=dp(lv-2)(pos+1) && s(pos)==s(pos+lv-1)
      })
    })

    val result=Buffer[Buffer[Int]]()
    var tmp=  Buffer[Buffer[Int]]()
    if(dp(s.length)(0))result.append(Buffer(s.length))
    (1 to s.length-1).filter(lv=>dp(lv)(0)).foreach(lv=>tmp.append(Buffer(lv)))

    while(tmp.size !=0){
      val curBf=Buffer[Buffer[Int]]()
      tmp.foreach(ele=>{
        val startPos=ele.last
        (1 to s.length-startPos).filter(lv=>{
          dp(lv)(startPos)
        }).foreach(lv=>{
          val endPos = startPos+lv
          if(endPos == s.length){
            result.append(ele.clone()++Buffer(endPos))
          }else{
            curBf.append(ele.clone() ++ Buffer(startPos+lv))
          }
        })
      })
      tmp=curBf
    }
    val res = Buffer[Buffer[String]]()
    result.foreach(arr => {
      var curRes = Buffer[String]()
      var pos = 0
      arr.foreach(pos2 => {
        curRes.append(s.slice(pos, pos2))
        pos = pos2
      })
      res.append(curRes)
    })
    res.map(_.toList).toList
  }

}
