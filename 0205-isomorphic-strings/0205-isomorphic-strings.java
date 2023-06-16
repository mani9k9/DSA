class Solution {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (sToT.containsKey(charS)) {
                if (sToT.get(charS) != charT) {
                    return false;
                }
            }

            if (tToS.containsKey(charT)) {
                if (tToS.get(charT) != charS) {
                    return false;
                }
            }

            sToT.put(charS, charT);
            tToS.put(charT, charS);
        }

        return true;
    }

   /* public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean isomorphic = isIsomorphic(s, t);
        System.out.println("Isomorphic: " + isomorphic);
    } */
}
