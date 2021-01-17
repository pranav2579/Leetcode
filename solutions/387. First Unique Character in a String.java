class Solution {
    public int firstUniqChar(String s) {
        
        Map<Character,Integer> freqMap = new HashMap<Character,Integer>();
        for(int i = 0; i< s.length(); i++)
        {
            freqMap.put(s.charAt(i), freqMap.getOrDefault( s.charAt(i), 0) + 1);
        }
        
        for(int i = 0; i < s.length(); i++)
        {
            if(freqMap.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
