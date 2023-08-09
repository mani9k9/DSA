class Solution {
    public int minimizeMax(int[] nums, int p) {
        
        int n = nums.length;
Arrays.sort(nums);
int left = 0;
int right = nums[n - 1] - nums[0];  // maximum difference in array

while (left < right) {
    int mid = (left + right) / 2;
    int c = 0; // Counter to keep track of pairs formed
    
    // Loop through the array to find pairs with a difference less than or equal to mid
    for (int i = 0; i < n - 1; i++) {
        if (nums[i + 1] - nums[i] <= mid) {
            i++; // Move to the next element as pairs can't have the same index
            c++; // Increment the counter to track the pairs formed
        }
    }
    
    // Check if the number of pairs formed is greater than or equal to p
    if (c >= p) {
        right = mid; // Adjust the upper bound of possible differences
    } else {
        left = mid + 1; // Adjust the lower bound of possible differences
    }
}

// The binary search ends when left and right converge, which will be the minimum maximum difference
return left;

        
    }
}