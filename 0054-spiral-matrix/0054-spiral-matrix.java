class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;
        int topRow = 0, bottomRow = rows - 1, leftCol = 0, rightCol = columns - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Traverse top row
            for (int col = leftCol; col <= rightCol; col++) {
                result.add(matrix[topRow][col]);
            }
            topRow++;

            // Traverse right column
            for (int row = topRow; row <= bottomRow; row++) {
                result.add(matrix[row][rightCol]);
            }
            rightCol--;

            // Traverse bottom row
            if (topRow <= bottomRow) {
                for (int col = rightCol; col >= leftCol; col--) {
                    result.add(matrix[bottomRow][col]);
                }
                bottomRow--;
            }

            // Traverse left column
            if (leftCol <= rightCol) {
                for (int row = bottomRow; row >= topRow; row--) {
                    result.add(matrix[row][leftCol]);
                }
                leftCol++;
            }
        }

        return result;
    }
}