import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=412 lang=java
 *
 * [412] Fizz Buzz
 */

// @lc code=start
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<String>(n);
        for (int i = 1; i <= n; i++) {
            if(i%15 == 0){
                output.add("FizzBuzz");
            } 
            else if(i%5 == 0){
                output.add("Buzz");
            } 
            else if(i%3 == 0){
                output.add("Fizz");
            }
            else {
                output.add(Integer.toString(i));
            } 
        }
        return output;
    }
}
// @lc code=end

