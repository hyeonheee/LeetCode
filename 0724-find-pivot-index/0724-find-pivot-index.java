class Solution {
    public int pivotIndex(int[] nums) {
        
        var total=Arrays.stream(nums).sum();
        var leftsum=0;
        
        for(int i=0; i<nums.length; i++){
            var rightsum=total-nums[i]-leftsum;
            
            if(leftsum==rightsum){
                return i;
            }
            
            leftsum+=nums[i];
        }
        return -1;
        
    }
}