class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.trim().split("\s+");
        //multiple spaces single split
        
        StringBuilder res = new StringBuilder();
        for(int idx = words.length-1; idx>=0;idx--){
            if(idx<words.length-1){
                res.append(" ");
            }
            res.append(words[idx]);
        }
        return res.toString();
        
    }
}