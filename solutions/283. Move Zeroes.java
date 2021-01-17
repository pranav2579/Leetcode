class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroElementIndex = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 0)
            {
                nums[lastNonZeroElementIndex++] = nums[i];
            }
        }
        for(int i = lastNonZeroElementIndex; i < nums.length; i++)
        {
            nums[i] = 0;
        }
    }
}
