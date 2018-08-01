import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (myMap.containsKey(need)) {
                result[0] = myMap.get(need);
                result[1] = i;
                return result;
            } else {
                myMap.put(nums[i], i);
            }
        }
        return null;
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) ++left;
            else if (!Character.isLetterOrDigit(s.charAt(right))) --right;
            else if (s.charAt(left) != s.charAt(right)) return false;
            else {
                ++left;
                --right;
            }
        }
        return true;
    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int div = 1;
        while (x / div >= 10) div *= 10;
        while(x > 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right) return false;
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }

    public int removeElement(int[] nums, int target) {
        int foundIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target) {
                nums[foundIdx++] = nums[i];
            }
        }
        return foundIdx;
    }

    public void rotateArray2(int[] nums, int k) {
        for (int i = 0; i <= k; i++) {
            nums = shiftArray(nums);
        }
    }

    public int[] shiftArray(int[] numArray) {
        int first = numArray[0];
        for (int i = 0; i < numArray.length - 1; i++) {
            numArray[i] = numArray[i+1];
        }
        numArray[numArray.length - 1] = first;
        return numArray;
    }

}