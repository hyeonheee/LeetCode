class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> dicionary = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (dicionary.containsKey(sc)) {
                if (tc != dicionary.get(sc))
                    return false;
            } else if (dicionary.containsValue(tc)) {
                return false;
            } else {
                dicionary.put(sc,tc);
            }
        }
        return true;
    }
}