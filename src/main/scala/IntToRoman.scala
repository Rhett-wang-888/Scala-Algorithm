// @title: IntToRoman
// @description: TODO 整数转换成罗马数字
// @author  Rhett
// @date 2021/4/17 10:20

object IntToRoman {


  val values: Array[Int] = Array(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
  val symbols: Array[String] = Array("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")

  def intToRoman(num: Int): String = {
    val sb = new StringBuilder
    var nums=num
    for(i :Int<- 1 to values.length ){
      if(values(i) <= nums && nums>=0) {
        nums=values(i)-nums
        sb.append(symbols(i))
      }
    }

    sb.toString
  }

}
