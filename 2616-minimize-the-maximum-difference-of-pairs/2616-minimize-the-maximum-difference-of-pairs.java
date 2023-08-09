class Solution {
    public int minimizeMax(int[] nums, int p) {
        
        int n = nums.length;
        Arrays.sort(nums);
        int left = 0;
        int right = nums[n-1]-nums[0]; //find the maximum difference in array
        
        while(left<right){
            int mid = (left+right)/2;
            int count=0; //counter
            
            for(int i=0;i<n-1;i++){
                if(nums[i+1]-nums[i]<=mid){
                    i++; // move to next element, pair not having same index
                    count++; //track pairs and increament the count
                }
            }
            if(count>=p){
                right = mid; //upper bound
            }
            else{
                left = mid+1; //lower bound
            }
        }
        return left;
    }
}