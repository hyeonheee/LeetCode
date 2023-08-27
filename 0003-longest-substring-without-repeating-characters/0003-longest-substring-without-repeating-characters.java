class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0) return 0;
        
        Map<Character, Integer> map=new HashMap<>();
        int left=0;
        int max=0;
        
        for(int right=0; right<s.length(); right++){
            char key=s.charAt(right);
            
        if(map.containsKey(key)){
            left=Math.max(left, map.get(key)+1);
        }
            
            if(right-left+1>max){
                max=right-left+1;
            }
            
            map.put(key,right);
        }
        return max;
        
    }
}