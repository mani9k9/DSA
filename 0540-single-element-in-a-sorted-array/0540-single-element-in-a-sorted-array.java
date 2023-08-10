class Solution {
    public int singleNonDuplicate(int[] nums) {
        /*
        //approach 1 using linear search
        for(int i=0; i<nums.length-1;i+=2){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
        */
        
        //approach 2 using binary search
        int left = 0;
        int right =nums.length-1;
        
        while(left<right){
            int mid =left+(right-left)/2;
            
            if(mid%2==1){
                mid--;
            }
            
            if(nums[mid] != nums[mid+1]){
                right =mid;
            }
            else{
            left =mid+2;
            }
        }
        return nums[left];
        
    }
}