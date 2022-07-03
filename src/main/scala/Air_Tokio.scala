object Air_Tokio extends App with Context {

  val df = spark.read
    .options(Map("header" -> "true", "inferSchema" -> "true", "delimiter" -> ","))
    .csv("src/main/Data_Source/Air_Traffic_Passenger_Statistics.csv")

  df.show(false)

}
