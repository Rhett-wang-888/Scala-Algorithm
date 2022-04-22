package sort

object ChoseSort {

  def main(args: Array[String]): Unit = {
    val nums:Array[Int]=Array(2, 45, 1, 4, 8, 2, 5, 8, 35, 67, 3, 9, 3, 8, 4, 7, 34);
    SelectSort(nums)
  }
  def SelectSort(nums:Array[Int]):Array[Int]={
    for(i <- 0 until nums.length){
      var currentMinIndex=i
      for(j<-i until nums.length){
        if(nums(currentMinIndex)>nums(j))
          currentMinIndex=j
      }
      if(currentMinIndex !=i){
        var tmp=nums(i)
        nums(i)=nums(currentMinIndex)
        nums(currentMinIndex)=tmp
      }
    }
    nums.foreach(println)

    nums
  }

}
