/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int start=0;
        int end=n;
        int mid=0;
        
        while(start<end){
            mid=start+(end-start)/2; //mid를 계산하는 공식
            if(isBadVersion(mid))
                end=mid;
            else
                start=mid+1;
            
        }
        return start;
    }
}