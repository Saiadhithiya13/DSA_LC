class Solution {
    public int numSpecial(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

        int count = 0;
      
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(mat[i][j] == 1) {
                    int rowCount = 0;
                    int colCount = 0;
                    for(int k = 0; k < col; k++) {                    
                        if(mat[i][k] == 1) {
                            rowCount++;
                        }
                    }
                    for(int k = 0; k < row; k++) {
                        if(mat[k][j] == 1) {
                            colCount++;
                        }
                    }
                    if(rowCount == 1 && colCount == 1) {
                    count++;
                    }
                }
                
                }
            }
        
        return count;
    }
}