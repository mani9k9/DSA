class Solution {
    public int arrayPairSum(int[] nums) {
   /*      // Step 1: Sort the array in ascending order
        Arrays.sort(nums);
        
        // Step 2: Calculate the sum of the minimum values in each pair
        int maxSum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }
        
        // Step 3: Return the maximized sum
        return maxSum; */
        
         // Find the maximum and minimum values in the input array
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num > maxNum) {
                maxNum = num;
            }
            if (num < minNum) {
                minNum = num;
            }
        }

        // Create a frequency array to count the occurrences of each element
        int[] frequency = new int[maxNum - minNum + 1];
        for (int num : nums) {
            frequency[num - minNum]++;
        }
        
        // Calculate the maximized sum of the minimum values
        int maxSum = 0;
        boolean isOdd = true; // Flag to alternate between odd and even frequency counts
        
        for (int i = 0; i < frequency.length; i++) {
            while (frequency[i] > 0) {
                if (isOdd) {
                    maxSum += i + minNum;
                }
                isOdd = !isOdd;
                frequency[i]--;
            }
        }
        
        // Return the maximized sum
        return maxSum;
    }
}