
object May20 {

  def main(args: Array[String]): Unit = {

    val num = 10
    var a = 0
    println(a)
    var b = 1
    println(b)
    for(i<-0 to num ){
      var c = a+b
      println(c)
      a = b
      b = c
    }
}
}
