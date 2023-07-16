class Solution {
    public int maxSubArray(int[] nums) {
         int maxSum = nums[0];  // Initialize maxSum with the first element
    int currentSum = nums[0];  // Initialize currentSum with the first element

    // Iterate through the array starting from the second element
    for (int idx = 1; idx < nums.length; idx++) {
        // Calculate the new currentSum by either extending the current subarray or starting a new subarray
        currentSum = Math.max(nums[idx], currentSum + nums[idx]);
        
        // Update maxSum if the new currentSum is greater
        if (currentSum > maxSum) {
            maxSum = currentSum;
        }
    }

    // Return the maximum sum found
    return maxSum;
    }
}