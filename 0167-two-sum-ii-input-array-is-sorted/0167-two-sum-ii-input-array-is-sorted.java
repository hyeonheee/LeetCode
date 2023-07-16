class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left=0;
        int right=numbers.length-1; // 마지막 요소

        while(left<right){
            
            if(target-numbers[left]==numbers[right]){
                break;
            }else if(target-numbers[left]>numbers[right]){
                left++;
            } else if (target-numbers[left]<numbers[right]) {
                right--;
            }
        }
        return new int[]{left+1,right+1};
    }
}