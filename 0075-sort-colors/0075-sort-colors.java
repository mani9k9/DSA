class Solution {
    public void sortColors(int[] nums) {
         int[] count = new int[3]; // Initialize count array to store the frequencies of red, white, and blue

        // Count the occurrences of each color
        for (int num : nums) {
            count[num]++;
        }

        int index = 0;

        // Overwrite the original array with the sorted colors
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[index] = i;
                index++;
                count[i]--;
            }
        }
    }
}