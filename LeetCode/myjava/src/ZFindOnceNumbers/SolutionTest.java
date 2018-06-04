package ZFindOnceNumbers;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numsTest = {1, 2, 3, 4, 5, 5, 4, 3};
        int[] num1 = new int[1];
        int[] num2 = new int[1];

        solution.FindNumsAppearOnce(numsTest, num1, num2);

        System.out.println(String.valueOf(num1[0])+String.valueOf(num2[0]));
    }
}
