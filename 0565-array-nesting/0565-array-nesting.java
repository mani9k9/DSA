class Solution {
    public int arrayNesting(int[] nums) {
     int ans = 0;
        int n = nums.length;
        for(int i=0; i<n;i++){
            int next =i; // value of the array index
            int count =0;
            while(nums[next]!= -1){
                count++;
                int temp= next;
                next = nums[next];
                nums[temp] = -1;
            }
            ans = Math.max(ans , count);
        }
        return ans;
    }
}