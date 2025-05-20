
object May20 {

  def main(args: Array[String]): Unit = {

  //find the prime number  1 to 100

    println("prime number from  1 to 100")
    for (i<-1 to 100){
      if(isPrime(i)){
        println(i + " ")
      }
    }

    def isPrime(n: Int): Boolean = {
      if(n <= 1)
        return false
      for(i<-2 to n/2){
        if(n%i == 0 ) return false
      }
      true
    }
  }


}
