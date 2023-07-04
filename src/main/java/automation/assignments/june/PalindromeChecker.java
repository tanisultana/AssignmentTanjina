package automation.assignments.june;
import java.util.Scanner;

       public class PalindromeChecker {
	   public static boolean isPalindrome(String str) {
	        
	        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        int left = 0;
	        int right = cleanStr.length() - 1;

	        while (left < right) {
	            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }

	        return true;
	    }
	    public static void main(String[] args) {
	        String str = "A man, a plan, a canal, Panama";

	        if (isPalindrome(str)) {
	            System.out.println(str + " is a palindrome.");
	        } else {
	            System.out.println(str + " is not a palindrome.");
	        }
	    }
	}
