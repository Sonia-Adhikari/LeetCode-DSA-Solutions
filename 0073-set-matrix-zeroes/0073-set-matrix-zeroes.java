class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] ans = new int[m][n];

       
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                ans[i][j] = matrix[i][j];
            }
        }

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(matrix[i][j] == 0){
                    int row = i;

                    while(row == i){
                        for(int col = 0; col<n; col++){
                            ans[row][col] = 0;
                        }
                        row++;
                    }

                    int c = j;
                    while(c == j){
                        for(int r = 0; r <m; r++){
                            ans[r][c] = 0;
                        }
                        c++;
                    }
                }
            }
        }
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                matrix[i][j] = ans[i][j];
            }
        }
        
    }
}