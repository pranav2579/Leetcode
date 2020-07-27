import java.util.HashMap;

/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums) {
            map.put(i, map.containsKey(i) ? map.get(i) +1 : 1 );
            if(map.get(i) > nums.length/2)
            {
                return i;
            }

        }

        return Integer.MAX_VALUE;
    }
}
// @lc code=end

