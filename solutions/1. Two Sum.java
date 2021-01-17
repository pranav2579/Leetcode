class Solution {
    public int[] twoSum(int[] nums, int target) {
        int solution[]  = new int[2];
​
        Map<Integer,Integer> numsMap = new HashMap<Integer,Integer>();
        for(int i = 0; i< nums.length; i++)
        {
            if(numsMap.containsKey(target-nums[i])){
                return (new int[] {numsMap.get(target-nums[i]),i});
            }
            numsMap.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
        
    }
}
