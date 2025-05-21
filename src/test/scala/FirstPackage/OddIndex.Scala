//Print the elements present in the Odd Number Index : arr(1) (3) (5)
object May20 {

  def main(args: Array[String]): Unit = {

    val arr = Array(10, 20, 30, 40, 50, 60, 70, 80, 90, 150, 160, 170, 180, 190)

    for(i<-0 until arr.length){
      if (i%2 != 0){
        println(arr(i))
      }
    }
