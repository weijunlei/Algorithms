package mergeoverlappinginterval;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Qingfeng
 * @date : 2018/8/28
 */
public class Main {
    public static void main(String[] args){
        MergeOverlappingInterval mergeOverlappingInterval = new MergeOverlappingInterval();
        List<Interval> intervals = new ArrayList<>();
        int[][] nums = {{1, 10},
                {2, 5},
                {3, 7},
                {10, 15},
                {20, 78}};

        for(int i = 0; i < nums.length; i++){
            intervals.add(new Interval(nums[i][0], nums[i][1]));
        }

        intervals = mergeOverlappingInterval.merge(intervals);
        for (int i = 0; i < intervals.size(); i++){
            System.out.printf("%d %d\n", intervals.get(i).start, intervals.get(i).end);
        }
    }
}
