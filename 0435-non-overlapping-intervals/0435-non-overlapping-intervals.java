
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
		if(intervals.length == 0)
			return 0;
		
        Arrays.sort(intervals, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
        });
        
        int count=1;	
        int boundEnd = intervals[0][1];
        
        for(int i=1; i<intervals.length ; ++i) {
        	if(boundEnd <= intervals[i][0]) {
        		boundEnd = intervals[i][1];
        		++count;
        	}
        }
        
        return intervals.length - count;
    }
}