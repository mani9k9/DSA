class Solution {
    public String sortString(String s) {
          Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        List<Character> chars = new ArrayList<>(freq.keySet());
        chars.sort(Comparator.naturalOrder());

        StringBuilder result = new StringBuilder();
        while (!chars.isEmpty()) {
            for (Character c : chars) {
                if (freq.get(c) > 0) {
                    result.append(c);
                    freq.put(c, freq.get(c) - 1);
                }
            }

            chars.removeIf(c -> freq.get(c) == 0);
            if (chars.isEmpty()) {
                break;
            }

            for (int i = chars.size() - 1; i >= 0; i--) {
                char c = chars.get(i);
                if (freq.get(c) > 0) {
                    result.append(c);
                    freq.put(c, freq.get(c) - 1);
                }
            }

            chars.removeIf(c -> freq.get(c) == 0);
        }

        return result.toString();
    }
}