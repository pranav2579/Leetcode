class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<Integer>();
        int carry = 0;
        int sum = 0;
        for(int i = digits.length - 1; i >= 0; i--)
        {
            if(i == digits.length - 1)
            {
                sum = digits[i] + carry + 1;
            }
            else 
            {
                sum = digits[i] + carry;
            }
            carry = sum/10;
            list.add(0,sum%10);
            
        }
        if(carry > 0)
        {
            list.add(0,carry);
        }
        
        int[] result = list.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}
