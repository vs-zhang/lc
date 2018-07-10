import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printLine();
        System.out.println("Two Sum:");
        int[] nums = {1, 3, 5};
        int target = 8;
        Solution s = new Solution();
        int[] result = s.twoSum(nums, target);
        System.out.println(Arrays.toString(result));

        printLine();
        System.out.println("isPalindrome String:");
        String p1 = "A man, a plan, a canal: Panama";
        String p2 = "race a car";
        System.out.printf("%s is Palindrome string: %s%n", p1, s.isPalindrome(p1));
        System.out.printf("%s is Palindrome string: %s%n", p2, s.isPalindrome(p2));

        printLine();
        System.out.println("isPalindrome Integer:");
        int x1 = 5115;
        int x2 = 55566;
        System.out.println(s.isPalindrome(x1));
        System.out.println(s.isPalindrome(x2));
    }

    public static void printLine() {
        System.out.println("======================");
    }
};