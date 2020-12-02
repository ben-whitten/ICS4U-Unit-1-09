/*
* The assignments program implements an application that
* generates a 4 random grades for 6 students and returns the class average.
*
* @author  Ben Whitten
* @version 1.0
* @since   2020-12-2 
*/

import java.util.Scanner;  // Import the Scanner class

public class Assignments {
  public static final int numberOfStudents = 6;
  public static final int numberOfAssignments = 4;
  public static final int maxPercent = 100;

  /////////////////////////////////////////////////////////////////////////////
  
  /**
   * Function which determines the average.
   */
  static int averageCalculation(int [] [] studentGrades) {
    int studentNumberTemp = 0;
    int assignmentNumberTemp = 0;
    int average = 0;
    int totalPercent = 0;
    for (studentNumberTemp = 0; studentNumberTemp < numberOfStudents;
         studentNumberTemp++) {
      assignmentNumberTemp = 0;

      for (assignmentNumberTemp = 0; assignmentNumberTemp
           < numberOfAssignments; assignmentNumberTemp++) {

        totalPercent = totalPercent
                       + studentGrades [studentNumberTemp]
                         [assignmentNumberTemp];
      }
    }

    average = totalPercent / (numberOfStudents * numberOfAssignments);
    return (average);

  }

  /////////////////////////////////////////////////////////////////////////////

  /**
   * This function creates the array and passes it into the other function.
   */
  public static void main(String[] args) {
    try {

      int [] [] studentGrades = new int [numberOfStudents] [
                                        numberOfAssignments];

      int studentNumber = 0;
      int assignmentNumber = 0;
      for (studentNumber = 0; studentNumber < numberOfStudents;
           studentNumber++) {
        assignmentNumber = 0;
        System.out.print("studentNumber: " + (studentNumber + 1)
                         + " | Grades: | ");
        for (assignmentNumber = 0; assignmentNumber < numberOfAssignments;
             assignmentNumber++) {
          studentGrades [studentNumber] [assignmentNumber] = ((int)
                                                              (Math.random()
                                                               * maxPercent));
          System.out.print(studentGrades [studentNumber] [assignmentNumber]
                           + " | ");
        }
        System.out.println();
      }

      int average = averageCalculation(studentGrades);
      System.out.println("The class average is: " + average + "%");

    } catch (Exception e) {
      System.out.println("AN ERROR HAS OCCURED");
    }
  }
  /////////////////////////////////////////////////////////////////////////////
}
