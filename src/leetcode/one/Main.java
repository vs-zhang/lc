package leetcode.one;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {1,2,3,4,5};
        int[] result = s.findTwoSum(a, 6);
        System.out.println(Arrays.toString(result));
    }
}