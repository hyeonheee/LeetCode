class Solution {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int farest = 0;
        for (int i = 0; i < nums.length; i++) {
            farest = Math.max(farest, i + nums[i]);
            if (farest >= nums.length - 1) {
                return true;
            }
            if (farest <= i) {
                return false;
            }
        }
        return true;
    }
}