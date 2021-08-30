import scala.collection.mutable

/**
 * @author Rhett
 * @title: TwoSum
 * @description: TODO 简单的求2个数之和 返回一个数组
 * @date 2021/8/30 11:47
 */

object TwoSum {
  def main(args: Array[String]): Unit = {

  }
  def twoSum1(nums:Array[Int],target:Int):Array[Int]={
    for (i<-nums.indices;j<-i+1 until nums.length){
      if(nums(i)+nums(j)==target){
        return Array(i,j)
      }
    }
    null
  }

  def twoSum2(nums:Array[Int],target:Int):Array[Int]={
    val map=new mutable.LinkedHashMap[Int,Int]
    for(i<-nums.indices){
      if(map.contains(nums(i))){
        return Array(map(nums(i)),i)
      }
      map.put(target-nums(i),i)
    }
    Array(0,0)
  }

  def twoSum3(nums:Array[Int],target:Int):Array[Int]={
    val map=nums.zipWithIndex
    map.filter(elem=>map.exists(kv=>kv._1==target-elem._1&&kv._2!=elem._2)).map(_._2)
  }

}
