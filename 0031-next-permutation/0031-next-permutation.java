class Solution {
    public void nextPermutation(int[] nums) {
       int n = nums.length;
    int i = n - 2;  // Start from the second last element

    // Find the first pair of adjacent elements where nums[i] < nums[i+1]
    while (i >= 0 && nums[i] >= nums[i+1]) {
        i--;
    }

    if (i >= 0) {
        int j = n - 1;
        // Find the smallest element greater than nums[i] to the right of nums[i]
        while (nums[j] <= nums[i]) {
            j--;
        }
        // Swap nums[i] and nums[j]
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Reverse the elements to the right of nums[i]
    int left = i + 1;
    int right = n - 1;
    while (left < right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--; 
    }
}
}