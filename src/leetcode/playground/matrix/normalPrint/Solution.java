package leetcode.playground.matrix.normalPrint;

public class Solution {
    public void printMatrix(int[][] matrix) {
        for (int[] row:matrix) {
            for (int data:row) {
                System.out.print(data + " ");
            }
            System.out.println();
        }
    }
}
