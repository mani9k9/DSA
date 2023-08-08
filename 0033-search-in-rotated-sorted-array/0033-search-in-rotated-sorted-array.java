class Solution {
    public int search(int[] nums, int target) { 
       //Approach 1
        // Linear Search
     /* int n = nums.length;
        for(int i =0;i<n;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
        */
        
        //Approach 2
        //Binary Search
        
        //initialize two pointer
        int left = 0;
        int right = nums.length - 1;
        
        //initialize mid value for binary search
        while(left <= right){
            int mid = left + (right-left)/2;
            
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] >= nums[left]){
            if(target < nums[mid] && target >= nums[left]){
                right = mid-1;
            }
            else{
                left = mid + 1;
            }  
            }
            else{
                if(target > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }
                else{
                    right = mid-1;
                }
            }
        }
        return -1;
        
    }
}