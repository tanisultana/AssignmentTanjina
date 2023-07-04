package automation.assignments.june;

public class PrimeNumberChecker {

		    public static boolean isPrime(int number) {
		        if (number <= 1) {
		            return false;
		        }
		        
		        // Check for divisibility from 2 to the square root of the number
		        for (int i = 2; i <= Math.sqrt(number); i++) {
		            if (number % i == 0) {
		                return false;
		            }
		        }
		        
		        return true;
		    }

		    public static void main(String[] args) {
		        int number = 17; // The number to be checked

		        if (isPrime(number)) {
		            System.out.println(number + " is a prime number.");
		        } else {
		            System.out.println(number + " is not a prime number.");
		        }
		    }
		

	}


