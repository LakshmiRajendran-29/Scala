
object May20 {

  def main(args: Array[String]): Unit = {

    var arr = Array(10,20,30,40,50,60,70,80)

    var targetSum = 100

    for(i<- 1 until arr.length){
      for(j<- i+1 until arr.length){
        if(arr(i) + arr(j) == 100){
        println(arr(i), arr(j))
      }
    }
  }
}
}
