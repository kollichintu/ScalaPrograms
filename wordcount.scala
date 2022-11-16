import org.apache.spark.SparkContext
import org.apache.log4j.Logger
import org.apache.log4j.Level



object wordcount extends App {
  
  Logger.getLogger("org").setLevel(Level.ERROR)
  
  val sc = new SparkContext("local[*]","wordcount")
  
  val inputText = sc.textFile("/C:/Trendy_Tech/Docs/Spark/search_data-201008-180523.txt")
  
  
  val words = inputText.flatMap(x =>x.split(" "))
  
  val wordCount = words.map(x =>(x,1))
  
  val finalCount = wordCount.reduceByKey((a,b)=> a+b)
  
  
  finalCount.collect.foreach(println)
  
}