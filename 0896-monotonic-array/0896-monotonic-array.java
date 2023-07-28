class Solution {
    public boolean isMonotonic(int[] n) {
        
     /*
     boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            } else if (nums[i] < nums[i - 1]) {
                increasing = false;
            }

            // If neither increasing nor decreasing, it can be both, so return false
            if (!increasing && !decreasing) {
                return false;
            }
        }
        return true; */
         boolean increasing = true;
        boolean decreasing = true;
        
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] > n[i + 1]) {
                increasing = false;
            }
            if (n[i] < n[i + 1]) {
                decreasing = false;
            }
        }
        
        return increasing || decreasing;
    }
}