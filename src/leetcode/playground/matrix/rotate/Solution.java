package leetcode.playground.matrix.rotate;

public class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int deep = 0;

        while(m>deep) {
            for (int i = deep; i < m - 1 - deep; i++) {
                int temp0 = matrix[deep][i];
                int temp1 = matrix[i][m-1-deep];
                int temp2 = matrix[m-1-deep][m-1-i];
                int temp3 = matrix[m-1-i][deep];
                matrix[i][m-1-deep] = temp0;
                matrix[m-1-deep][m-1-i] = temp1;
                matrix[m-1-i][deep] = temp2;
                matrix[deep][i] = temp3;
            }
            deep += 1;
        }

    }
}