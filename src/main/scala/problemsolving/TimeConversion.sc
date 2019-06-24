val time = "07:05:45PM"
val time2 = "09:05:45AM"
val time3 = "12:05:45PM"
val time4 = "12:05:45AM"

/*
     * Complete the timeConversion function below.
     */
def timeConversion(s: String): String = {
  /*
   * Write your code here.
   */

  val time = s.stripSuffix("AM").stripSuffix("PM").split(":")

  if(s.contains("AM") && time(0) == "12") {
    time(0) = "00"
  }
  if(s.contains("PM") && (time(0).toInt != 12)) {
    time(0) = (time(0).toInt + 12).toString
  }

  time.mkString(":")
}

timeConversion(time4)
