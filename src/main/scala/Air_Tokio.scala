import org.apache.spark.sql.functions._

object Air_Tokio extends App with Context {

  // CARGAR EL CONJUNTO DE DATOS EN UN DATAFRAME
  val df = spark.read
    .options(Map("header" -> "true", "inferSchema" -> "true", "delimiter" -> ","))
    .csv("src/main/Data_Source/Air_Traffic_Passenger_Statistics.csv")

  //df.show(false)
  //df.printSchema()

  //2
  //val totalCompanies = df.select("Operating Airline").distinct().count()
  //println("Total de compañias de vuelo: " +totalCompanies)

  //3
  /*
  val totalPassengerPerCompany = df.groupBy("Operating Airline")
    .agg(round(avg("Passenger Count"), 2)
    .alias("Total Passenger"))
    .orderBy("Total Passenger")
    .show(100,false)
   */



}
