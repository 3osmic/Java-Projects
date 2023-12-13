/**
 * The Person, Student, Employee, Faculty, and Staff Classes
 *
 * @author Aliyah Lewis
 *
 */
public class Tester {
	/**
     * Starts the program running and prints the people's name based on their title
     * @param args command line arguments
     */
	public static void main(String[] args) {
		Person person = new Person("Peter");
		Student student = new Student("Susan");
		Employee employee = new Employee("Eva");
		Faculty faculty = new Faculty("Frank");
		Staff staff = new Staff("Shane");

		System.out.println(person);
		System.out.println(student);
		System.out.println(employee);
		System.out.println(faculty);
		System.out.println(staff);
	}
}








