class Solution {
    
    public static String reverseWords(String s) {
        char[] chars = s.toCharArray(); // Convert the string to a character array
        int start = 0;
        
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') { // Found a word boundary
                reverseWord(chars, start, i - 1); // Reverse the word
                start = i + 1; // Update the start index for the next word
            }
        }
        
        reverseWord(chars, start, chars.length - 1); // Reverse the last word
        
        return new String(chars); // Convert the character array back to a string
    }
    
    private static void reverseWord(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        String sentence = "Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.";
        String reversedSentence = reverseWords(sentence);
        System.out.println(reversedSentence);
    }
             
    
}