package mergeoverlappinginterval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author : Qingfeng
 * @date : 2018/8/28
 */
public class MergeOverlappingInterval {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() == 0){
            return intervals;
        }
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start != o2.start){
                    return o1.start - o2.start;
                }else{
                    return o1.end - o2.end;
                }
            }
        });

        List<Interval> result = new ArrayList<>();
        for(int i = 0; i < intervals.size();){
            Interval temp = new Interval(intervals.get(i).start, intervals.get(i).end);
            while (i != intervals.size() - 1 && temp.end >= intervals.get(i + 1).start){
                temp.end = intervals.get(i + 1).end > temp.end ? intervals.get(i + 1).end : temp.end;
                i++;
            }
            result.add(temp);
            i++;
        }

        return result;
    }
}
