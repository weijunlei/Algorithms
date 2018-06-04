package ZGetLeastNumbersSolution;

import java.util.ArrayList;

public class SolutionTest {
    public static void main(String[] args){
    int[] testList = {4, 5, 1,6,2,7,3};
    SolutionTwo solutionTwo = new SolutionTwo();
    ArrayList<Integer> result = solutionTwo.GetLeastNumbers_Solution(testList, 4);
    System.out.println(result);
    }
}
