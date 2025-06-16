package project1;


 public class Backtracking {

    static void generateSubsets(int[] nums, int index, String current) {
        if (index == nums.length) {
            System.out.println(current);
            return;
        }

        // Include the current element
        generateSubsets(nums, index + 1, current + nums[index] + " ");

        // Exclude the current element (backtrack)
        generateSubsets(nums, index + 1, current);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        generateSubsets(nums, 0, "");
    }
}
