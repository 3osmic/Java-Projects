/**
 * The Person, Student, Employee, Faculty, and Staff Classes
 *
 * @author Aliyah Lewis
 *
 */

class Person {
    public String name;
    // private String address;
    // private String phoneNumber;
    // private String emailAddress;
    // private java.util.Calendar dateHired;

    /**
     * Constructs a person with the name
     *
     * @param name | The name of the person
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Returns the person's string representation
     *
     * @return "Person: " + name | String with the class name and the person's name
     */
    @Override
    public String toString() {
        return "Person: " + name;
    }
}

class Student extends Person {
    // private final String class_status;

	/**
     * Constructs a student with the name
     *
     * @param name | The student's name
     */
    public Student(String name) {
        super(name);
    }

    /**
     * Returns the student's string representation
     *
     * @return "Student: " + name | String with the class name and the student's name
     */
    @Override
    public String toString() {
        return "Student: " + name;
    }
}

class Employee extends Person {
    // private String office;
    // private double salary;
    // private java.util.Calendar dateHired;

	/**
     * Constructs an employee with the name
     *
     * @param name | The employee's name
     */
    public Employee(String name) {
        super(name);
    }

    /**
     * Returns the employee's string representation
     *
     * @return "Employee: " + name | String with the class name and the employee's name
     */
    @Override
    public String toString() {
        return "Employee: " + name;
    }
}

class Faculty extends Employee {
    // private String office_hrs;
    // private String rank;

	/**
     * Constructs a faculty with the name
     *
     * @param name | The faculty's name
     */
    public Faculty(String name) {
        super(name);
    }

    /**
     * Returns the faculty's string representation
     *
     * @return "Faculty: " + name | String with the class name and the faculty's name
     */
    @Override
    public String toString() {
        return "Faculty: " + name;
    }
}

class Staff extends Employee {
    // private String title;

	/**
     * Constructs a staff with the name
     *
     * @param name | The staff's name
     */
    public Staff(String name) {
        super(name);
    }

    /**
     * Returns the staff's string representation
     *
     * @return "Staff: " + name | String with the class name and the Staff's name
     */
    @Override
    public String toString() {
        return "Staff: " + name;
    }
}