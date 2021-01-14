import java.util.ArrayList;
import java.util.Stack;

/*
 * @lc app=leetcode id=476 lang=java
 *
 * [476] Number Complement
 */

// @lc code=start
class Solution {
    public int findComplement(int num) {
        // concert decimal to binary
        Stack<Integer> S = new Stack<Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        if (num == 1)
            return 0;
        if (num == 0)
            return 1;
        while(num>1)
        {
            int remainder = num%2;
            S.push(remainder);
            num = num/2;
        }
        S.push(1);
        
        for (int i = 0; i < S.size(); i++) {
            al.add(S.pop());
        }
            

        // get rid of leading 0s Make compliment
        for (int i = 0; i < al.size(); i++) {
            if(al.get(i)==0)
                al.set(i, 1);
            else
                al.set(i, 0);
        }
        int startIndex = 0;
        while(al.get(startIndex) == 1)
        {
            startIndex++;
        }
        int finalnumber = 0;
        for (int i = startIndex; i < al.size(); i++) {
            if(al.get(i) == 1){
                finalnumber += Math.pow(2.0, al.size()-i);
            }
        }
        return finalnumber;


        // Convert binary to decimal
    }
}
// @lc code=end

