/**
 * Class extends Array List
 *
 * @author Aliyah Lewis
 *
 */

import java.util.ArrayList;

public class Tester {
	/**
     * Starts the program running and prints the amount of student's in the specified course
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Brian Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        ArrayList<String> students1 = course1.getStudents();
        for (String student : students1) {
            System.out.print(student + ", ");
        }

        System.out.println();
        System.out.print("Number of students in course2: " + course2.getNumberOfStudents());
    }
}
