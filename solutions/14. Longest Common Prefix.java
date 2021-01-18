class Solution {
    public String longestCommonPrefix(String[] strs) {
        int lcpLength = 0;
        
        if(strs.length == 0)
            return "";
        int minlength = strs[0].length();
        for(int i = 0; i< strs.length; i++)
        {
            minlength = Math.min(minlength, strs[i].length());
        }
        
        for(int i = 0; i<minlength; i++)
        {
            for(int j = 0; j<strs.length-1; j++)
            {
                if(strs[j].charAt(i) != strs[j+1].charAt(i))
                {
                    return strs[0].substring(0,lcpLength);
                }
            }
            
            lcpLength++;
​
        }
        return strs[0].substring(0,lcpLength);
        
    }
}
