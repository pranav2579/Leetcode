class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<Integer>();
        Map<Integer,Integer> freqMap1 = new HashMap<Integer,Integer>();
        Map<Integer,Integer> freqMap2 = new HashMap<Integer,Integer>();
        int count = 0;
​
        for(int i:nums1)
            freqMap1.put(i ,freqMap1.getOrDefault(i,0) + 1 );
        for(int i:nums2)
            freqMap2.put(i ,freqMap2.getOrDefault(i,0) + 1 );
        
        for(Map.Entry entry: freqMap1.entrySet())
        {
            if(freqMap2.getOrDefault(entry.getKey(), 0) > 0)
            {
                count = (Integer)entry.getValue() <= (Integer)freqMap2.get(entry.getKey()) ? (Integer)entry.getValue() : (Integer)freqMap2.get(entry.getKey()); 
                for(int j=0; j<count; j++)
                {
                    result.add((Integer)entry.getKey());
                }
            }
            
        }
        int[] result2 = result.stream().mapToInt(Integer::intValue).toArray();
        return result2;
        // String[] array = list.toArray(new String[list.size()]);
    }
}
