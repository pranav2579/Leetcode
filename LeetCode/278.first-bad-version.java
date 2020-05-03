/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */


class Solution{
    public int firstBadVersion(int n) {
        int mid,start,end;
        boolean isBad;
        while (start > end)
        
        {
            start = 0;
            end = n-1;
            mid = (end - start)/2;
            isBad = firstBadVersion(mid);
            if(isBad)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return mid;
    }
}
// @lc code=end

