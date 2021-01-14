/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 0)
            return -1;
        int xorSum = 0;
        for (int i : nums) {
            xorSum = xorSum ^ i;
        }
        return xorSum;
    }
}
// @lc code=end

