class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        int z = x ^ y;
        while (z > 0) {
            count += z&1;
            z = z>>>1;
        }
        return count;
    }
}
