/**
 * Stack extends ArrayList
 *
 * @author Aliyah Lewis
 *
 */

import java.util.Scanner;

public class Tester {
	/**
     * Starts the program running and prints the the inputed strings in reverse order
     * @param args command line arguments
     */
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five strings:");

        for (int i = 0; i < 5; i++) {
            System.out.print("String " + (i + 1) + ": ");
            String input = scanner.nextLine();
            stack.push(input);
        }

        scanner.close();
        
        System.out.println("\nStrings in reverse order:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}