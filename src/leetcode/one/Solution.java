package leetcode.one;

import java.util.HashMap;

public class Solution {
    public int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> dict = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int need = target - num;
            if (dict.containsKey(need)) {
                int[] result = {dict.get(need), i};
                return result;
            } else {
                dict.put(num, i);
            }
        }
        return nums;
    }
}

