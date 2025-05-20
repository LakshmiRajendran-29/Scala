object May20 {

  def main(args: Array[String]): Unit = {

    //Input the Size from User
    
    println("Enter the Size of the Array: ")
    var size = scala.io.StdIn.readInt()

    // create an Array
    
    var arr =new Array[Int](size)
      for(i<-0 until size) {
        println(s"Enter the Array Element at $i: Index")
        arr(i) = scala.io.StdIn.readInt()
    }

      for(i<-0 until size)
      {
        println(arr(i))
      }
}
}
