class Solution {
    public String toLowerCase(String s) {
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z') {
                currentChar = (char) (currentChar + 32);
                s = s.substring(0, i) + currentChar + s.substring(i + 1);
            }
        }
        return s;
    }
}