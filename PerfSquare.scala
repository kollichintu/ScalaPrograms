import scala.io.StdIn._

object PerfSquare {
  
  def main(args:Array[String]){
    
    // Taking no.of customers as first input
    val noOfCutsomers:Int = readInt()
    
    //Taking bills input value as 
    val billsAmount:String = readLine()
    
    val billsAmnt:Array[Int] = billsAmount.split(" ").map(x => x.toInt)
    
    var count = 0
    for(i <- billsAmnt){
      
     val sqrt = Math.sqrt(i)
     if(sqrt.ceil - sqrt == 0){
       count = count + 1
     }
      
    }
    println(count)
  }
  
}