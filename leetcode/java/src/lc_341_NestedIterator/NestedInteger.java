package lc_341_NestedIterator;

import java.util.LinkedList;
import java.util.List;

public class NestedInteger {
    private boolean isNum;
    private Integer num;
    private List<NestedInteger> list;

    public NestedInteger(int num){
        this.num = num;
        this.isNum = true;
    }

    public NestedInteger(List<Integer> list){
        this.list = new LinkedList<>();
        for(int num: list){
            this.list.add(new NestedInteger(num));
        }
        this.isNum = false;
    }

    public NestedInteger(int[] nums){
        this.list = new LinkedList<>();
        for(int num: nums){
            this.list.add(new NestedInteger(num));
        }
        this.isNum = false;
    }

    public boolean isInteger(){
        return this.isNum;
    }

    public Integer getInteger(){
        return this.num;
    }

    public List<NestedInteger> getList(){
        return this.list;
    }
}
