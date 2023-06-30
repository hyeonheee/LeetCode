class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); //정렬
        ArrayList<List<Integer>> ret = new ArrayList<List<Integer>>(); //결과값을 저장하는 배열
        int length = nums.length;
        int j, k; //2번째 3번째 point

        for (int i = 0; i < length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                j = i + 1; //2번째 point는 첫번째 point 바로 오른쪽
                k = length - 1; //3번째 point는 맨마지막 
                while (j < k) {
                    if (nums[i] + nums[j] + nums[k] == 0) { // 합이 0이면 결과 list에 저장
                        List<Integer> out = new ArrayList<Integer>();
                        out.add(nums[i]);
                        out.add(nums[j]);
                        out.add(nums[k]);
                        ret.add(out);
                        j++;
                        k--;

                        while (j < length - 1 && nums[j] == nums[j - 1]) {
                            j++;
                        }
                        while (k > j && nums[k] == nums[k + 1]) {
                            k--;
                        }
                    } else if (nums[i] + nums[j] + nums[k] > 0) {
                        k--;
                    } else {
                        j++;
                    }
                }
            }
        }
        return ret;

    }
}