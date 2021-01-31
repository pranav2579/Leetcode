/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
​
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // find the first point where bad version happens
        return firstBadVersionParameter(n, 0, n-1);
        }
    
    public int firstBadVersionParameter(int n, int start, int end) {
        if(start > end)
            return -1;
        
        // find the first point where bad version happens
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(isBadVersion(mid)) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return start;
        
    }
}
