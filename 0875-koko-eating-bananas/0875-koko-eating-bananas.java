class Solution {
    
    public boolean isPossible(int[] piles, int hours, int speed){
        long sum = 0;
        
        for(int bananas : piles){
            sum += bananas / speed;
            if(bananas % speed != 0) sum++;
        }
        
        return sum<=hours;
    }
    
    public int minEatingSpeed(int[] piles, int hours) {
        long left = 1, right = (long)1e9;
        
        while(left <= right){
            long mid = left + (right - left) / 2;
            
            if(isPossible(piles, hours, (int)mid)){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        
        return (int)left;
    }
}
