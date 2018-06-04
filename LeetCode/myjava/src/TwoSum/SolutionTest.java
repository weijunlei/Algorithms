package TwoSum;

public class SolutionTest {
    public static void main(String[] args)
    {
        MySolution solution = new MySolution();
        int[] a = {2,4,3};
        System.out.printf("%d\t%d\n", solution.twoSum(a, 5)[0], solution.twoSum(a, 5)[1]);
    }
}
