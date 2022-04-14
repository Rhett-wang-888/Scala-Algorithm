package sort

object ShellSort {

  def main(args: Array[String]): Unit = {
    shellSort()

  }

  def shellSort():Unit={
    val sortArray = Array(49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51,43)
    var d1:Int = sortArray.length
    var booleanX = true
    sortArray.foreach( x => print(" "+ x))
    println()
    while(booleanX){
      d1 = Math.ceil(d1 / 2).toInt
      val d= d1
      if(d == 1){
        booleanX = false
      }
      var sortTemp  = 0
      for(x <- 0 until  d ){
        for( i <- Range((x + d) , sortArray.length ,d)){
          var j = i - d
          sortTemp = sortArray(i)
          while(j>=0 && sortArray(j) > sortTemp){   //这里因为没有java 的 for  强大功能
            sortArray(j+d) =sortArray(j)          //比较如果不大于的话 ，最后又把值付给自个
            j -=d
          }
          //println( "x = "+ x + " i= " + i + " d =  " + d + " j = " + j )
          sortArray(j+d) = sortTemp
          sortArray.foreach( x => print(" "+ x))
          println()
        }
      }
    }

  }

  def shellSort1(arr:Array[Int]):Array[Int]={

    var step=arr.length/2
    while(step>0){
      for(i<-0 until step){
        for(j<-i+step to(arr.size-1,step)){
          if(arr(j)<arr(j-step)){
            var k=j-step
            while(k>0 && arr(k+step)<arr(k)){
              swap(arr,k,k+step)
              k-=step
            }
          }
        }
      }
      step/=2
    }

    arr
  }

  def swap(arr:Array[Int],i:Int,i1:Int):Unit={
    val tmp:Int=arr(i)
    arr(i)=arr(i1)
    arr(i1)=tmp
  }




}
