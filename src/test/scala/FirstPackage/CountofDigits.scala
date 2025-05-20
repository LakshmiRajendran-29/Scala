object May20 {

  def main(args: Array[String]): Unit = {

  // count of digits
    var num = 1234516

    var count =0

    while (num != 0){
      count +=1
      num = num/10

    }
    println(count)

  }


}
