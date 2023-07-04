package automation.assignments.june;

public class MaximumSubarraySum {

	public static void main(String[] args) {

		 
		        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		        
		        int maxSum = findMaximumSubarraySum(nums);
		        
		        System.out.println("Maximum Subarray Sum: " + maxSum);
		    }
		    
		    public static int findMaximumSubarraySum(int[] nums) {
		        int maxSum = Integer.MIN_VALUE;
		        int currentSum = 0;
		        
		        for (int i = 0; i < nums.length; i++) {
		            currentSum += nums[i];
		            
		            if (currentSum > maxSum) {
		                maxSum = currentSum;
		            }
		            
		            if (currentSum < 0) {
		                currentSum = 0;
		            }
		        }
		        
		        return maxSum;
		    }
		
	

	}


