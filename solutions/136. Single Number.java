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
