object May20 {

  def main(args: Array[String]): Unit = {
    
    val arr = Array(34,23,45,25,62,12,19)

    for(i<-0 until arr.length) {

      for (j <- 0 until arr.length-1-i) {
        
        if (arr(j) > arr(j+1)) {
          arr(j) = arr(j) ^ arr(j+1)
          arr(j+1) = arr(j) ^ arr(j+1)
          arr(j) = arr(j) ^ arr(j+1)

        }

      }
     println(arr.mkString(", "))
    }
}
}
