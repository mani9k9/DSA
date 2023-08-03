class Solution {
    public int strStr(String input, String value) {
        
        int n = value.length();
        if(input.equals(value)){
            return 0;
        }
        for(int i = 0;i<=input.length()-n; i++){
            String str = input.substring(i,i+n);
            if(str.equals(value)){
                return i;
            }
        }
        return -1;
        
    }
}

