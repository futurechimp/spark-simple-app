import com.typesafe.config.ConfigFactory
import org.apache.spark.SparkContext


object SimpleApp {
  def main(args: Array[String]) {

    val config = new Settings(ConfigFactory.load())

    val textFile = "/etc/hosts" // Should be some file on your system
    val sc = new SparkContext(config.sparkurl,
    "Simple App",
    config.sparkhome,
    List("target/scala-2.10/spark-simple-app_2.10-1.0.jar"))
    
    val logData = sc.textFile(textFile, 2).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))

    // In real life, you might want to use the Loan Pattern to ensure that
    // this SparkContext detaches from the cluster without fail, but...
    sc.stop() // this is necessary in order to cleanly detach from the cluster
  }
}