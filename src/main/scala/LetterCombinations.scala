// @title: LetterCombinations
// @description: TODO 电话数字转换成字母 回溯
// @author  Rhett
// @date 2021/4/25 10:20

import scala.collection.mutable.{ListBuffer,Map}
object LetterCombinations {
  val ret=ListBuffer[String]()

  def letterCombinations(digits:String):List[String]={
    val num2Letter=Map[Int,String](0->"",1->"",2->"abc",3->"def",4->"ghi",
      5->"jkl",6->"mno",7->"pqrs",8->"tuv",9->"wxyz")
    var length: Int = digits.length
    if(length==0)return List[String]()

    val letters=digits.toCharArray.map(c=>{
      val key=c.toString.toInt
      if(num2Letter.contains(key)) num2Letter(key) else ""
    })
    if(letters.mkString("")=="")return List[String]()
    ret.clear()
    letters.filter(_!="").map(_.toCharArray.map(_.toString))


    return ret.toList
  }

  def backtrackreletterComninations(letters_arr:Array[Array[String]],k:Int,depth:Int,
                                    route:List[String]):Unit={
    if(depth==k){
      ret +=route.mkString("")
      return
    }

    for(i<-(0 until letters_arr(depth).size)){
      backtrackreletterComninations(letters_arr,k,depth+1,route.:+(letters_arr(depth)(i)))
    }

  }

}
