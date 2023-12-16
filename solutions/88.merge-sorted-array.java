/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    /**
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int end = m + n - 1;
        int end1 = m - 1;
        int end2 = n - 1;

        while (end1 >= 0 && end2 >= 0 && end >= 0) {
            if (nums1[end1] >= nums2[end2]) {
                nums1[end] = nums1[end1];
                end--;
                end1--;
            } else if (nums1[end1] < nums2[end2]) {
                nums1[end] = nums2[end2];
                end--;
                end2--;
            }
        }

        while (end1 >= 0) {
            nums1[end] = nums1[end1];
            end--;
            end1--;
        }

        while (end2 >= 0) {
            nums1[end] = nums2[end2];
            end--;
            end2--;
        }
    }
}
// @lc code=end
