package printminnumber;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author : Qingfeng
 * @date : 2018/6/13
 */
public class PrintMinNumber {
    public String printMinNumber(int [] numbers) {
        if (numbers == null || numbers.length == 0) {
            return "";
        }
        ArrayList<String> strList = new ArrayList<>();
        for ( int i : numbers) {
            String tempStr = String.valueOf(i);
            strList.add(tempStr);
        }

        strList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s1.compareTo(s2);
            }
        });

        StringBuilder result = new StringBuilder();
        for (String i : strList) {
            result.append(i);
        }

        return result.toString();
    }
}
