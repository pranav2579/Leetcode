/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */
import java.util.*;

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<Character>();
        char[] character = s.toCharArray();
        
    for (char c : character) {

        if(c=='{' || c == '[' || c == '(') {
            stack.push(c);
        }
        else if(c == '}' && (stack.size()== 0 || stack.pop() != '{' )){
            return false;
        }

        else if(c == ')' && (stack.size()== 0 || stack.pop() != '(' )){
            return false;
        }

        else if(c == ']' && (stack.size()== 0 || stack.pop() != '[' )){
            return false;
        }
    }

    // When the string is over stack should be empty
    if(stack.size()!=0)
        return false;

    return true;

    }
}
// @lc code=end

