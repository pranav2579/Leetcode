class PalindromeNumber
{
    public boolean isPalindrome(int x) {
        
        if(x<0)
        return false;
        int original_num = x;
        long reverse = 0;
        int remainder = 0;
        while (x>0){
            remainder = x%10;
            reverse = reverse*10 + remainder;
            x = x/10;
        }

        if( (int)reverse ==  original_num){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        
    }
}