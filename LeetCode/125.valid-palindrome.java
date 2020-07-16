/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {

        String s_lower = s.toLowerCase();
        String s1 = TrimString(s_lower);

        int start = 0;
        int finish = s1.length()-1;

        while(start < finish){
            if(s1.charAt(start) == s1.charAt(finish)){
                start++;
                finish--;
            }
            else
            {
                return false;
            }
        }

        if(start >= finish)
            return true;

        return false;
    }

    private String TrimString(String s) {
    StringBuffer sb = new StringBuffer();

    char[] chararray = s.toCharArray();
        for ( char c : chararray) {
            if (Character.isLetterOrDigit(c))
                sb.append(c);
        }
    return sb.toString();
    }
}
// @lc code=end

