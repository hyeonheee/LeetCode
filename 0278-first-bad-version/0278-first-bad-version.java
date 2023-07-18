/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int start=0;
        int end=n;
        int mid=0;
        
        while(start<end){
            mid=start+(end-start)/2; //mid를 계산하는 공식
            if(isBadVersion(mid)) //현재 mid가 잘못된 제품인 경우
                end=mid; //mid가 최초 잘못된 제품이거나, mid 이전에 잘못된 제품이 있을 수 있음
            else // 현재 mid가 올바른 제품인 경우
                start=mid+1; // mid 이후에 잘못된 버전이 있음
            
        }
        return start; 
    }
}