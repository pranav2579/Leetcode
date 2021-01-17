class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0,j=matrix[0].length - 1 ; i< j; i++,j--)
        {
            int[] temp = matrix[i];
            matrix[i] =  matrix[j];
            matrix[j] = temp;
        }
        
        for(int i = 0;i < matrix[0].length ; i++)
        {
            for(int j = i+1; j < matrix[0].length ; j++)
            {
                int temp = matrix[i][j] ;
                matrix[i][j] =  matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
