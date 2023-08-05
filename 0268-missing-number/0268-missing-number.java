class Solution {
    public int missingNumber(int[] nums) {
      //sort the array
        Arrays.sort(nums);
        
        //initialize the left, right and mid point
        int left = 0;
        int right = nums.length-1;
        
        while(left<=right){
            int mid= (left+right)/2;
            
            if(nums[mid]==mid){
                left = left+1;
            }
            else if(nums[mid] > mid){
                right = right-1;
            }
            else{
                left=left+1;
            }
        }
        return left;
    }
}