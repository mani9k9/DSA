class Solution {
  
    public boolean isAlphaNumeric(char ch){
        if(ch>='a' && ch<='z') return true;
        if(ch>='A' && ch<='Z') return true;
        if(ch>='0' && ch<= '9') return true;
        return false;
    }
    
    
    
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        
        int left = 0, right=s.length()-1;
        
        while(left <= right){
            if(isAlphaNumeric(s.charAt(left))==false){
                left++; continue;
            }
              if(isAlphaNumeric(s.charAt(right))==false){
                right--; continue;
             }
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++; right--;
        }
        return true;
    }
}