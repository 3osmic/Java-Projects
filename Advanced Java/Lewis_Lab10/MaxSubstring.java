import java.util.Scanner;

public class MaxSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String maxSubstring = findMaxSubstring(input);
        System.out.println("Maximum consecutive increasingly ordered substring is: " + maxSubstring);
        scanner.close();
    }

    public static String findMaxSubstring(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }

        String maxSubstring = "";
        int maxLength = 0;
        
        for (int i = 0; i < input.length(); i++) {
            int j = i + 1;
            while (j < input.length() && input.charAt(j) > input.charAt(j - 1)) {
                j++;
            }
            int length = j - i;
            if (length > maxLength) {
                maxLength = length;
                maxSubstring = input.substring(i, j);
            }
            i = j - 1;
        }

        return maxSubstring;
    }
}
