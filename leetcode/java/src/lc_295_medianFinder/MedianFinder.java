package lc_295_medianFinder;

import java.util.ArrayList;
import java.util.List;

class MedianFinder {
    private List<Integer> list;

    /** initialize your data structure here. */
    public MedianFinder() {
        list = new ArrayList<>();
    }

    public void addNum(int num) {
        if (list.isEmpty()){
            list.add(num);
            return;
        }
        int insertIndex = 0;
        for(; insertIndex < list.size(); insertIndex++){
            if(list.get(insertIndex) > num){
                break;
            }
        }
        list.add(insertIndex, num);
    }

    public double findMedian() {
        if (list.size() % 2 != 0){
            return list.get(list.size() / 2);
        } else {
            return 1.0 * (list.get(list.size() / 2 - 1) + list.get(list.size() / 2)) / 2;
        }
    }
}
