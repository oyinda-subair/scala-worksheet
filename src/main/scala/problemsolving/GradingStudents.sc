import scala.collection.mutable.ArrayBuffer

val arr = Array(73, 67, 38, 33)

def roundUp(grade: Int): Int = (grade + 4) / 5 * 5

def professorGradeRule(grade: Int): Int = {
  val multiply5 = grade / 5
  val roundBy5 = if(grade % 5 == 0) multiply5 * 5 else (multiply5 + 1) * 5
  if(roundBy5 - grade < 3 && grade >= 38) roundBy5 else grade
}

/*
     * Complete the gradingStudents function below.
     * Every student receives a grade in the inclusive range from 0 to 100
     * Any grade less than 40 is failing grade
     * Sam is a professor at the university and likes to round each student's grade according to these rule
     * * if the difference between the grade and the next multiple of 5 is less than 3,
     * * * round grade up to the next multiple of 5
     * * if the value of grade is less than 38, no rounding occurs as the result will still be a failing grade
     */
def gradingStudents(grades: Array[Int]): Array[Int] = {
  /*
   * Write your code here.
   */

//  val finalGrade = ArrayBuffer[Int]()
//
//  for(grade ← grades) {
//    val newGrade = roundUp(grade)
//
//    if(grade < 38 || (newGrade - grade) == 3) finalGrade += grade
//    else finalGrade += newGrade
//
//  }
//
//  finalGrade.toArray

  grades.map(professorGradeRule)

}

gradingStudents(arr)
