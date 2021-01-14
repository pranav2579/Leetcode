class Solution {
    public boolean isAnagram(String s, String t) {
​
        if(s.length() != t.length())
            return false;
            
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        char[] schar = s.toCharArray();
        for (char c : schar) {
            map.put(c, (map.containsKey(c) ? map.get(c) + 1 : 1 ));
        }
​
        char[] tchar = t.toCharArray();
        for (char c : tchar) {
            if(map.containsKey(c) && map.get(c) != 0)
            {
                map.put(c, (map.get(c)-1));
                if(map.get(c) == 0)
                {
                    map.remove(c);
                }
            }
        }
        if(map.size() == 0)
        return true;
        else
        return false;
    }
}
