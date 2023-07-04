package automation.assignments.june;
import java.util.Scanner;
public class StringReversal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);

        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}


