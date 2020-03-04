package findcontinuoussequence;

import java.util.ArrayList;

/**
 * @author : Qingfeng
 * @date : 2018/6/20
 */
public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> findContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();

        if (sum <= 0) {
            return results;
        }

        for (int i = 2; i < Math.sqrt(2 * sum); i++) {
            System.out.println(i);
            if ((sum % i == 0 && i % 2 == 1) || (sum % i) * 2 == i ) {
                ArrayList<Integer> result = new ArrayList<>();
                for (int j = (int) sum / i - (i - 1) / 2; j < (int) sum / i - (i - 1) / 2 + i; j++) {
                    result.add(j);
                }
                if (!result.isEmpty()) {
                    results.add(result);
                }
            }
        }

        return results;
    }
}
