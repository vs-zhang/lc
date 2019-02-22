package leetcode.playground.matrix.spiralPrint;

public class Solution {
    public void spiralPrint(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int p = 0;
        int q = 0;
        while (m>p && n>q) {
            for (int i = p; i < n - 1 - p; i++) {
                System.out.printf("%2d ", matrix[p][i]);
            }
            for (int j = q; j < m - 1 - q; j++) {
                System.out.printf("%2d ", matrix[j][n-1-q]);
            }
            for (int k = n - 1 - p ; k > p; k --) {
                System.out.printf("%2d ", matrix[m-1-p][k]);
            }
            for (int j = m - 1 - q ; j > q; j --) {
                System.out.printf("%2d ", matrix[j][q]);
            }
            p += 1;
            q += 1;
        }
    }
}