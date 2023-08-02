class Solution {
    public int lengthOfLastWord(String s) {
        var word = s.trim().split(" ");
        return word[word.length - 1].length();
    }
}