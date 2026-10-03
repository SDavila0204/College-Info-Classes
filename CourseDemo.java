package CourseInfoClasses;

/**
   This program demonstrates the CourseInfoClasses.Course class.
*/

public class CourseDemo
{
   public static void main(String[] args)
   {
      // Create an CourseInfoClasses.Instructor object.
      Instructor myInstructor =
          new Instructor("Kramer", "Shawn", "RH3010");
      
      // Create a CourseInfoClasses.TextBook object.
      TextBook myTextBook =
          new TextBook("Starting Out with Java",
                       "Gaddis", "Scott/Jones");
                       
      // Create a CourseInfoClasses.Course object.
      Course myCourse = 
         new Course("Intro to Java", myInstructor,
                    myTextBook);
      
      // Display the course information.
      System.out.println(myCourse);
   }
}