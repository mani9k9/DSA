class Solution {
    public int arrayPairSum(int[] nums) {
         // Step 1: Sort the array in ascending order
        Arrays.sort(nums);
        
        // Step 2: Calculate the sum of the minimum values in each pair
        int maxSum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }
        
        // Step 3: Return the maximized sum
        return maxSum;
    }
}