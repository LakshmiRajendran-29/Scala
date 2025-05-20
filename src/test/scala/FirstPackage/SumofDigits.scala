object May20 {

  def main(args: Array[String]): Unit = {

  // sum of digits
    var num = 1234516

    var sum =0

    while (num > 0){
      var digit = num%10
      sum +=digit
      num = num/10

    }
    println(sum)

  }


}
