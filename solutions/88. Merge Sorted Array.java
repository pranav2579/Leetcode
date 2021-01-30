class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int size1 = nums1.length;
        int size2 = nums2.length;
        
        // Maintain 2 pointers and keep filling end of array
        int i = m-1;
        int j = n-1;
        int fill = size1 - 1;
        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[fill] = nums1[i];
                i--;
                fill--;
            } else {
                nums1[fill] = nums2[j];
                j--;
                fill--;
            }
        }
        
        while (i >= 0 && fill >= 0){
            nums1[fill] = nums1[i];
            i--;
            fill--;
        }
        while (j >= 0 && fill >= 0){
            nums1[fill] = nums2[j];
            j--;
            fill--;
        }
    }
}
