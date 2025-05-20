


object May20 {

  def main(args: Array[String]): Unit = {

    val arr = Array(10, 10, 10, 20, 20, 30, 10, 30, 40, 50, 60, 70, 70, 70)
    val freq = new Array[Int](arr.length)
    var visited = -1

    // a. Find the Frequency of each Number
    println("Frequencies:")
    for (i <- 0 until arr.length) {
      var count = 1
      for (j <- i + 1 until arr.length) {
        if (arr(i) == arr(j)) {
          count += 1
          freq(j) = visited
        }
      }
//      println(arr(i),freq(i))
      if (freq(i) != visited) {
        freq(i) = count
        println(arr(i) + ": " + count)
      }
    }

    // b. Display only Duplicate Numbers
    println("\nDuplicate Numbers:")
    for (i <- 0 until freq.length) {
      if (freq(i) > 1) {
        println(arr(i))
      }
    }

    // c. Display Unique Numbers
    println("\nUnique Numbers:")
    for (i <- 0 until freq.length) {
      if (freq(i) == 1) {
        println(arr(i))
      }
    }
}
}
