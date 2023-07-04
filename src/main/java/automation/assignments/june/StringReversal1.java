package automation.assignments.june;

public class StringReversal1 {

	    public static String reverseString(String str) {
	        char[] charArray = str.toCharArray();
	        int start = 0;
	        int end = charArray.length - 1;

	        while (start < end) {
	            // Swap characters at start and end positions
	            char temp = charArray[start];
	            charArray[start] = charArray[end];
	            charArray[end] = temp;

	            // Move the start and end positions towards the middle
	            start++;
	            end--;
	        }

	        return new String(charArray);
	    }

	    public static void main(String[] args) {
	        String input = "Hello, World!";
	        String reversed = reverseString(input);

	        System.out.println("Original string: " + input);
	        System.out.println("Reversed string: " + reversed);
	    }
	}
