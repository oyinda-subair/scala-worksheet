
/*
* Maria plays college basketball and wants to go pro. Each season she maintains a record of her play.
* She tabulates the number of times she breaks her season record for most points and least points in a game.
* Points scored in the first game establish her record for the season, and she begins counting from there.
*
* For example, assume her scores for the season are represented in the array scores = [12, 24, 10, 24].
* Scores are in the same order as the games played. She would tabulate her results as follows:
 */

// Complete the breakingRecords function below.
def breakingRecords(scores: Array[Int]): Array[Int] = {

  var highestScores = 0
  var lowestScores = 0

  var highestPoint = scores.head
  var lowestPoint = scores.head

//  for(a ← scores) {
//    if(a > highestPoint) {
//      highestScores += 1
//      highestPoint = a
//    }
//    if(a < lowestPoint) {
//      lowestScores += 1
//      lowestPoint = a
//    }
//  }

  scores.foreach { a ⇒
    if(a > highestPoint) {
      highestScores += 1
      highestPoint = a
    }
    if(a < lowestPoint) {
      lowestScores += 1
      lowestPoint = a
    }
  }

  Array(highestScores, lowestScores)
}

val arr = Array(10, 5, 20, 20, 4, 5, 2, 25, 1)
val arr2 = Array(3, 4, 21, 36, 10, 28, 35, 5, 24, 42)

breakingRecords(arr)