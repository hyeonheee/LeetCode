class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> queue = 
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue()); 
        queue.addAll(map.entrySet());

        int[] rst = new int[k];
        for (int i = 0; i < k; i++) {
            rst[i] = queue.poll().getKey();
        }
        return rst;
    }
}