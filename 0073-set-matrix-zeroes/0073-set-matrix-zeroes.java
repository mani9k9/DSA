class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
    int n = matrix[0].length;
    boolean[] zeroRows = new boolean[m];
    boolean[] zeroCols = new boolean[n];
    
    // Iterate over the matrix to find the rows and columns containing zeros
    for (int row = 0; row < m; row++) {
        for (int col = 0; col < n; col++) {
            if (matrix[row][col] == 0) {
                zeroRows[row] = true;
                zeroCols[col] = true;
            }
        }
    }
    
    // Iterate over the matrix again to set zeros based on zeroRows and zeroCols
    for (int row = 0; row < m; row++) {
        for (int col = 0; col < n; col++) {
            if (zeroRows[row] || zeroCols[col]) {
                matrix[row][col] = 0;
            }
        }
    }

    }
}