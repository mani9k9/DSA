class Solution {
    
    public int[] getFreq(String str){
        int[] freq = new int[26];
        for(char ch: str.toCharArray()){
            freq[ch-'a']++;
        }
        return freq;
    }
    
    public boolean isAnagram(String s1, String s2) {
        if(s1.length() !=s2.length()){
            return false;
        }
        
        int[] f1= getFreq(s1);
        int[] f2 = getFreq(s2);
        
        for(int idx = 0; idx < 26; idx++){
            if(f1[idx]!= f2[idx]){
                return false;
            }
        }return true;
    }
}