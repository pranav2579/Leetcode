/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int start = 0;
        int end = n-1;
        int mid;
        while (start <= end)
        {
            mid = start + (end - start) / 2;

            boolean result = VersionControl.isBadVersion(mid);
            if(result)
                start = mid+1;
            else
                end = mid-1;
        }

        return mid;

    }
}
// @lc code=end

