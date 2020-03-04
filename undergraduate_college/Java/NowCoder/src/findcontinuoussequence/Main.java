package findcontinuoussequence;

import java.util.ArrayList;

/**
 * @author : Qingfeng
 * @date : 2018/6/20
 */
public class Main {
    public static void main(String[] args) {
        FindContinuousSequence findContinuousSequence = new FindContinuousSequence();
        ArrayList<ArrayList<Integer>> arrayLists = findContinuousSequence.findContinuousSequence(100);
        for (ArrayList<Integer> i : arrayLists) {
            System.out.println(i.toString());
        }
    }
}
