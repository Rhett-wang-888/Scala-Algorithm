package sort

object InsertSort {
  def main(args: Array[String]): Unit = {
    var intArray=Array(5,2,3,1,4,6,8,7)
    insertSort2(intArray)

  }
  def insertSort1(intArray:Array[Int]):Unit={
    for(i<-0 until intArray.length){
      for(j<- 0 until i){
        if(intArray(i)<intArray(j)){
          var tmp=intArray(i)
          intArray(i)=intArray(j)
          intArray(j)=tmp
        }
      }
    }
    intArray.foreach(println)
  }
  def insertSort(intArray:Array[Int]):Unit={
    println("before sorted: ")
    for(i<-intArray){
      println(i)
    }

    val intlength= intArray.length-1
    for(i<- 1 to intlength){
      val tmp=intArray(i)
      var j=i-1

      while((j>=0)&&(intArray(j)>tmp)){
        intArray(j+1) =intArray(j)
        j-=i
      }
      intArray(j+1)=tmp
    }
    println("after sorted: ")
    intArray.foreach {i=>println(i)}

  }
  def insertSort2(intArray: Array[Int]):Unit = {
    //排序前
    println("排序前")
    for ( i <- intArray) {//数组输出方式一
      println(i)
    }

    val intlength = intArray.length - 1

    for (i <- 1 to intlength) {
      val tmp = intArray(i)
      var j = i -1

      while ((j >= 0) && (intArray(j) > tmp)) {
        intArray(j + 1) = intArray(j)
        j -= 1
      }

      intArray(j + 1) = tmp
    }

    println("排序后的数组")
    //排序后
    intArray.foreach { i => println(i) }//数组输出方式二
  }
}
