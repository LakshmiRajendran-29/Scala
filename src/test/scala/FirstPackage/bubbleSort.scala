object May20 {

  def main(args: Array[String]): Unit = {

    val arr = Array(34,23,45,25,62,12,19)

    for(i<-0 until arr.length) {

      for (j <- i + 1 until arr.length) {
        if (arr(i) > arr(j)) {
          arr(i) = arr(i) ^ arr(j)
          arr(j) = arr(i) ^ arr(j)
          arr(i) = arr(i) ^ arr(j)
        }
      }
    }
    println(arr.mkString(", "))
}
}
