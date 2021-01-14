class Solution {
    public void rotate(int[] nums, int k) {
        int  size = nums.length;
        int k1 = k%size;
        
        int[] newnums = new int[size];
        for (int i = 0; i <size; i++) {
            newnums[(i+k1)%size] = nums[i];
        }
        for (int i = 0; i < newnums.length; i++) {
            nums[i] = newnums[i];
        }
        ;
    }
}
