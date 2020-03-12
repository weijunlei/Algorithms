package lc_125_isPalindrome;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"A man, a plan, a canal: Panama", "race a car"};
        for(String str: strs) {
            System.out.println("String:" + str + "is palindrome:" + solution.isPalindrome(str));
        }
    }
}
