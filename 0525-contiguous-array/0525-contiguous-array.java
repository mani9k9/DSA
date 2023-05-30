import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findMaxLength(int[] nums) {
        int maxLength = 0;
        int count = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, -1); // Initial count of 0s and 1s is 0 with index -1

        for (int i = 0; i < nums.length; i++) {
            count += nums[i] == 1 ? 1 : -1;

            if (count == 0) {
                maxLength = Math.max(maxLength, i + 1);
            } else if (countMap.containsKey(count)) {
                int prevIndex = countMap.get(count);
                maxLength = Math.max(maxLength, i - prevIndex);
            } else {
                countMap.put(count, i);
            }
        }

        return maxLength;
    }
}
