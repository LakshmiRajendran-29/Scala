object May20 {

  def main(args: Array[String]): Unit = {

    val str = "swissers"
    var freq = new Array[Int](str.length())
    var visited = -1


    for (i<- 0 until str.length()){
      var count = 1
      for(j<- i+1 until str.length()) {
        if (str(i) == str(j)) {
          count += 1
          freq(j) = visited
        }
      }

        if (freq(i) != visited)
        {
          freq(i) = count
          println(str(i) + ":" + count)
        }
      }
}
}
