import java.util.Arrays;
​
public class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, Boolean.TRUE);
        
        int count = 0;
        for (int i = 2; i < n; i++) {
            for (int j = 2; i*j < n; j++) {
                isPrime[i*j] = false;
            }
        }
        
        for (int k = 2; k < n; k++) {
            if (isPrime[k] == true) {
            count++;
            }
        }
        
        return count;
    }
}
