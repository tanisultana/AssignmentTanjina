package automation.assignments.june;

public class RotatedBinarySearch {

	public static void main(String[] args) {
		
		    
		        int[] array = {4, 5, 6, 7, 0, 1, 2};
		        int target = 0;

		        int index = search(array, target);

		        if (index != -1) {
		            System.out.println("Element found at index: " + index);
		        } else {
		            System.out.println("Element not found in the array.");
		        }
		    }

		    public static int search(int[] nums, int target) {
		        int left = 0;
		        int right = nums.length - 1;

		        while (left <= right) {
		            int mid = left + (right - left) / 2;

		            if (nums[mid] == target) {
		                return mid;
		            }

		            // Check if the left half is sorted
		            if (nums[left] <= nums[mid]) {
		                // Check if the target is within the left half
		                if (nums[left] <= target && target < nums[mid]) {
		                    right = mid - 1;
		                } else {
		                    left = mid + 1;
		                }
		            }
		            // If the left half is not sorted, then the right half must be sorted
		            else {
		                // Check if the target is within the right half
		                if (nums[mid] < target && target <= nums[right]) {
		                    left = mid + 1;
		                } else {
		                    right = mid - 1;
		                }
		            }
		        }

		        // Element not found in the array
		        return -1;
		    }
		

	}


