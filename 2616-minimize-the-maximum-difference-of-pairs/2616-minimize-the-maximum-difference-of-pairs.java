class Solution {
    public int minimizeMax(int[] nums, int p) {
             int n=nums.length;
    Arrays.sort(nums);
    int left=0,right=nums[n-1]-nums[0];
    while(left<right){
        int mid=(left+right)/2,c=0;
        for(int i=0;i<n-1;i++)
            if(nums[i+1]-nums[i]<=mid){
                i++;
                c++;
            }
        if(c>=p)
            right=mid;
        else
            left=mid+1;
    }
    return left;
    }
}