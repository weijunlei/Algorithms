package lc_341_NestedIterator;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<NestedInteger> nestedIntegers = new LinkedList<>();
        nestedIntegers.add(new NestedInteger(5));
        int[] nums = {1, 2, 3};
        nestedIntegers.add(new NestedInteger(nums));
        nestedIntegers.add(new NestedInteger(9));
        NestedIterator i = new NestedIterator(nestedIntegers);
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
