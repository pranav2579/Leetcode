class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // rowwise checks
        for(int i = 0; i<9 ; i++)
        {
            Map<Character,Character> map = new HashMap<Character,Character>();
            for(int j = 0; j<9 ; j++)
            {
                if(board[i][j] != '.')
                {
                    if(map.containsKey(board[i][j])){
                        return false;        
                    }
                    map.put(board[i][j],board[i][j]);    
                }
            }
        }
        
        // columnwise checks
        for(int j = 0; j<9 ; j++)
        {
            Map<Character,Character> map = new HashMap<Character,Character>();
            for(int i = 0; i<9 ; i++)
            {
                if(board[i][j] != '.')
                {
                    if(map.containsKey(board[i][j])){
                        return false;        
                    }
                    map.put(board[i][j],board[i][j]);    
                }
            }
        }
        
        // grid checks
       for(int k = 0; k<9 ; k+=3)
       {
           for(int l = 0; l<9 ; l+=3)
           {
               Map<Character,Character> map = new HashMap<Character,Character>();
                for(int i = k; i<k+3 ; i++)
                {
                    for(int j = l; j<l+3 ; j++)
                    {
                        if(board[i][j] != '.')
                        {
                            if(map.containsKey(board[i][j])){
                                return false;        
                            }
                            map.put(board[i][j],board[i][j]);    
                        }
                        
                    }
                }
               
           }
       }
        
        return true;
    }
}
