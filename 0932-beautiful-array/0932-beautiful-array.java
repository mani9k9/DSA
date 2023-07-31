class Solution {
    public int[] beautifulArray(int n) {
          List<Integer> nums = new ArrayList<>();
        nums.add(1);

        while (nums.size() < n) {
            List<Integer> newNums = new ArrayList<>();

            for (int num : nums) {
                if (2 * num - 1 <= n) {
                    newNums.add(2 * num - 1);
                }
            }
            for (int num : nums) {
                if (2 * num <= n) {
                    newNums.add(2 * num);
                }
            }

            nums = newNums;
        }

        int[] beautifulArr = new int[n];
        for (int i = 0; i < n; i++) {
            beautifulArr[i] = nums.get(i);
        }

        return beautifulArr;
    }
}