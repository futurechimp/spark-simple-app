import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._

object SimpleApp {
  def main(args: Array[String]) {
    val sc = new SparkContext("local", "Simple App", "$SPARK_HOME",
        List("target/scala-2.10/spark-simple-app_2.10-1.0.jar"))
    val textFile = "/etc/hosts" // Should be some file on your system
    val logData = sc.textFile(textFile, 2).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))
  }
}