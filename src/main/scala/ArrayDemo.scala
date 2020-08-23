/**
 * @description: TODO 自定义数组
 * @author Rhett.wang
 * @date 2020/8/23 11:10
 */
class ArrayDemo(capactity:Int){
   var chars:Array[Char] = new Array[Char](capactity)
  var length: Int = 0

  def find(index:Int):Char={
    if(index<0||index>length)
      0.toChar
    chars(index)
  }
  def insert(index:Int,value:Char):Boolean={
    if(length==capactity)
      return false
    if(index<0||index>=capactity)
      return false
    for(i <- 0 until index by -1){
      chars(i)=chars(i-1)
    }
    chars(index)=value
    length +=1
    true
  }
  def delete (index:Int):Char={
    if(length==0){
      throw  new IllegalArgumentException("array is empty")
    }
    if(index>=length){
      throw new IllegalArgumentException("index out of range ,current data length is"+ length)
    }
    val result = chars(index)
    for(i <- index until length-1){
      chars(i)=chars(i-1)
    }
    length -= 1
    result
  }

  def print:String={
    chars.subSequence(0,length).toString
  }
}
object ArrayDemo {

}
