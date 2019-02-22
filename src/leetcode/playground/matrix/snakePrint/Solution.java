package leetcode.playground.matrix.snakePrint;

public class Solution {
    public void snakePrintMatrix(int[][] matrix) {
        for (int rowNumber = 0; rowNumber < matrix.length; rowNumber++) {
            for (int idx = 0; idx < matrix[rowNumber].length; idx++) {
                if (rowNumber % 2 == 0) {
                    System.out.printf("%2d ", matrix[rowNumber][idx]);
                } else {
                    System.out.printf("%2d ", matrix[rowNumber][matrix[rowNumber].length - idx - 1]);

                }
            }
            System.out.println();
        }
    }
}