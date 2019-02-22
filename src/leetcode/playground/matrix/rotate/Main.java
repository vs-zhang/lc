package leetcode.playground.matrix.rotate;

class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13, 14, 15, 16}};
        Solution s = new Solution();
        s.rotate(matrix);
        for (int[] row:matrix) {
            for(int j:row) {
                System.out.printf("%2d ", j);
            }
            System.out.println();
        }
    }
}