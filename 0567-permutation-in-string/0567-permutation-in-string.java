class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int[] s1count = new int[26];
        int[] s2count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            int idx = s1.charAt(i) - 'a';
            s1count[idx]++;
            s2count[idx]++;
        }

        int start = 0;
        int end = 0;

        while (end < s2.length()) {
            if (s2count[s2.charAt(end) - 'a'] > 0) {
                s2count[s2.charAt(end) - 'a']--;
                if((end-start+1)==s1.length()){
                    return true;
                }else{
                    end++;
                }
            }else {
                if(s1count[s2.charAt(start)-'a']>0){
                    s2count[s2.charAt(start)-'a']++;
                    start++;
                }else {
                    end++;
                    start=end;
                }
            }
        }
        return false;
    }
}