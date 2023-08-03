import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    // Mapping of digits to letters
    private static final Map<Character, String> digitToLetters = new HashMap<>();
    static {
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits != null && !digits.isEmpty()) {
            backtrack("", digits, result);
        }
        return result;
    }

    private void backtrack(String combination, String nextDigits, List<String> result) {
        // Base case: if there are no more digits left to process, add the current combination to the result
        if (nextDigits.isEmpty()) {
            result.add(combination);
        } else {
            // Get the letters corresponding to the next digit in the sequence
            char digit = nextDigits.charAt(0);
            String letters = digitToLetters.get(digit);
            // Explore all possible combinations with the next digit's letters
            for (char letter : letters.toCharArray()) {
                backtrack(combination + letter, nextDigits.substring(1), result);
            }
        }
    }
}
