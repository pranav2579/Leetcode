class Solution {
    public int reverse(int x) {
        long reverse = 0;
        long quotient = 0;
        boolean isNegative = false;
        if(x<0)
        {
            isNegative = true;
            x *= -1;
        }
        while(x>0){
            quotient = x%10;
            x = x/10;
            reverse = reverse*10 + quotient;
        }
        
        if(reverse > Integer.MAX_VALUE)
        {
            return 0;
        }
        
        if(isNegative)
        {
            reverse*=-1;
        }   
         
     return (int)reverse;   
    }
}
