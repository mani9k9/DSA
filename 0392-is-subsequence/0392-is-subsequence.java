class Solution {
     public static boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        int sIdx = 0;  // Index for string s
        int tIdx = 0;  // Index for string t

        // Iterate until either one of the strings is fully processed
        while (sIdx < sLen && tIdx < tLen) {
            if (s.charAt(sIdx) == t.charAt(tIdx)) {
                // If the current characters match, move to the next character in s
                sIdx++;
            }
            // Move to the next character in t in every iteration
            tIdx++;
        }

        // Check if all characters in s have been processed
        return sIdx == sLen;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        boolean isSubseq = isSubsequence(s, t);
        System.out.println(isSubseq);  // Output: true
    }
}