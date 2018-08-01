import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        divider();
        System.out.println("Two Sum:");
        int[] nums = {1, 3, 5};
        int target = 8;
        Solution s = new Solution();
        int[] result = s.twoSum(nums, target);
        System.out.println(Arrays.toString(result));

        divider();
        System.out.println("isPalindrome String:");
        String p1 = "A man, a plan, a canal: Panama";
        String p2 = "race a car";
        System.out.printf("%s is Palindrome string: %s%n", p1, s.isPalindrome(p1));
        System.out.printf("%s is Palindrome string: %s%n", p2, s.isPalindrome(p2));

        divider();
        System.out.println("isPalindrome Integer:");
        int x1 = 5115;
        int x2 = 55566;
        System.out.println(s.isPalindrome(x1));
        System.out.println(s.isPalindrome(x2));

        divider();
        System.out.println("remove Element:");
        int[] nums2 = {1, 3, 5, 8};
        int removeElement = 3;
        s.removeElement(nums2, removeElement);
        System.out.println(Arrays.toString(nums2));

        divider();
        System.out.println("rotate array:");
        System.out.println("method 2:");
        int[] numsRotateArray = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        s.rotateArray2(numsRotateArray, k);
        System.out.println(Arrays.toString(numsRotateArray));


    }

    public static void divider() {
        System.out.println("========================================================================");
    }
};