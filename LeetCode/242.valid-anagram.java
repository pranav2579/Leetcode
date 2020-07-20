import java.util.HashMap;

import sun.jvm.hotspot.ci.ciBaseObject;
import sun.jvm.hotspot.ci.ciEnv;
import sun.jvm.hotspot.ci.ciField;

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;
            
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        char[] schar = s.toCharArray();
        for (char c : schar) {
            map.put(c, (map.containsKey(c) ? map.get(c) + 1 : 1 ));
        }

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
// @lc code=end

