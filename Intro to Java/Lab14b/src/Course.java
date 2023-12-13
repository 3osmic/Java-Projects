/**
 * Class extends Array List
 *
 * @author Aliyah Lewis
 *
 */

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();

    /**
     * Constructs a course with the name
     *
     * @param courseName | The name of the course
     */
    public Course(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Adds a student to the course
     *
     * @param student | The name of the student that will be added
     */
    public void addStudent(String student) {
        students.add(student);
    }

    /**
     * Gets the list of students in the course
     *
     * @return students | A list of student names
     */
    public ArrayList<String> getStudents() {
        return students;
    }

    /**
     * Gets the number of students in the course
     *
     * @return students.size() | The number of students in the course
     */
    public int getNumberOfStudents() {
        return students.size();
    }

    /**
     * Gets the name of the course
     *
     * @return courseName | The name of the course
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Drops a student from the course
     *
     * @param student | The name of the student that will be dropped
     */
    public void dropStudent(String student) {
        students.remove(student);
    }
}
