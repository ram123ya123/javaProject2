package project1;
import java.util.Arrays;

public class Program33 {
    
    // Method to find the sum of three integers closest to the target
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return target; // exact match
                }
            }
        }

        return closest;
    }

    // Main method to run test cases
    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        System.out.println("Output 1: " + threeSumClosest(nums1, target1)); // Expected: 2

        // Test Case 2
        int[] nums2 = {0, 0, 0};
        int target2 = 1;
        System.out.println("Output 2: " + threeSumClosest(nums2, target2)); // Expected: 0
    }
    }   // Additi
