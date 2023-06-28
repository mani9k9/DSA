//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int maxRow = -1; // Index of row with maximum 1's
        int maxCount = 0; // Maximum count of 1's
        
        int row = 0; // Start from the first row
        int col = m - 1; // Start from the last column
        
        while (row < n && col >= 0) {
            if (arr[row][col] == 1) {
                // Found a 1 in the current column
                col--; // Move left to check for more 1's in the current row
                maxRow = row; // Update the maxRow
                maxCount++; // Increment the count of 1's
            } else {
                // Found a 0 in the current column
                row++; // Move down to check in the next row
            }
        }
        
        return maxRow;
    }
}

