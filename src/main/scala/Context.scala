import org.apache.log4j.{Level, Logger}
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

trait Context {

  Logger.getLogger("org").setLevel(Level.ERROR)

  lazy val sparkConf: SparkConf = new SparkConf()
    .setAppName("Proyecto Tokio")
    .setMaster("local[*]")
    .set("spark.cores.max", "2")

  lazy val spark: SparkSession = SparkSession
    .builder()
    .config(sparkConf)
    .getOrCreate()

}
