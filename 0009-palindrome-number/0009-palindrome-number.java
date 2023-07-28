class Solution {
    public boolean isPalindrome(int x) {
        int rev=reverse(x);
           if(rev==x){
               return true;
           }
           else return false;
        }
        static int reverse(int x){
             int rev=0,rem;
           while(x>0){
               rem=x%10;
               rev=rev*10+rem;
               x/=10;
           }
           return rev;
        }
    }