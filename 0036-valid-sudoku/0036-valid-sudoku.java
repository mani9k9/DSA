import java.util.Scanner;

class Solution {
    public boolean isValidSudoku(char[][] board) {
             // Check each row
        for (int row = 0; row < 9; row++) {
            if (!isUnique(board[row])) {
                return false;
            }
        }

        // Check each column
        for (int col = 0; col < 9; col++) {
            char[] column = new char[9];
            for (int row = 0; row < 9; row++) {
                column[row] = board[row][col];
            }
            if (!isUnique(column)) {
                return false;
            }
        }

        // Check each 3x3 sub-box
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                char[] subBox = new char[9];
                int index = 0;
                for (int row = boxRow * 3; row < boxRow * 3 + 3; row++) {
                    for (int col = boxCol * 3; col < boxCol * 3 + 3; col++) {
                        subBox[index++] = board[row][col];
                    }
                }
                if (!isUnique(subBox)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isUnique(char[] chars) {
        boolean[] seen = new boolean[10];
        for (char ch : chars) {
            if (ch != '.') {
                int num = ch - '0';
                if (seen[num]) {
                    return false;
                }
                seen[num] = true;
            }
        }
        return true;
    

    /*public static void main(String[] args) {
        char[][] sudokuBoard = new char[9][9];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Sudoku board (9x9) values:");
        for (int row = 0; row < 9; row++) {
            String rowValues = scanner.next();
            for (int col = 0; col < 9; col++) {
                sudokuBoard[row][col] = rowValues.charAt(col);
            }
        }

        if (isValidSudoku(sudokuBoard)) {
            System.out.println("The Sudoku board is valid.");
        } else {
            System.out.println("The Sudoku board is invalid.");
        }*/
    }
}