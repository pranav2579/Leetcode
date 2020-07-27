import java.util.HashMap;

/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0)
         return false;

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i : nums) {
            if(map.containsKey(i))
                return true;
            else
                map.put(i,i);
        }
        return false;
    }
}
// @lc code=end

