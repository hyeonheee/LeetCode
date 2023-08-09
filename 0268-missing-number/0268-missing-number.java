class Solution {
    public int missingNumber(int[] nums) {
        int answer = 0;
        
        int len = nums.length;
        
        boolean[] contained = new boolean[len+1];
        
        for(int i=0;i<len;i++){
            contained[nums[i]] = true;
        }
        
        for(int i=0;i<=len;i++){
            if(!contained[i]) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}