/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 */

// @lc code=start
class Solution {

    // Recursive relation to build this on:
    // rob[i] = Math.Max(rob[i-2] + nums[i] , rob[i-1])
    
    public int rob(int[] nums)
    {
        if(nums.length == 0){
            return 0;
        }
        
        int[] memo = new int[nums.length +1 ];
        memo[0] = 0;
        memo[1] = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            memo[i+1] = Math.max(memo[i-1] + nums[i] , memo[i] );
        }

    return memo[nums.length];

    }

}
// @lc code=end

