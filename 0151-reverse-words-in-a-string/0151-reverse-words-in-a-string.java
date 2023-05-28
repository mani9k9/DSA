class Solution {
    public String reverseWords(String s) {
     
         //Second Approach two ponter 
        
        int right = s.length()-1;
        StringBuilder res = new StringBuilder();
        
        //iterate on all words
        while(right>=0){
            while(right>=0 && s.charAt(right) ==' '){
                right--;
            }
            int left = right;
                //left will stop at starting index of a word
                while(left>=0 && s.charAt(left) != ' '){
                    left--;
                }
            
            if(res.length() >0 && left< right) res.append(" ");
            
            for(int idx = left+1; idx <= right; idx++){
                res.append(s.charAt(idx));
            }
            right=left;
        }
        return res.toString();
        
        
       
    }
}