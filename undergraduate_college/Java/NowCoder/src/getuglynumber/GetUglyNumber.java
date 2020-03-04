package getuglynumber;

/**
 * @author : Qingfeng
 * @date : 2018/6/13
 */
public class GetUglyNumber {
    public int getUglyNumber(int index) {
        if (index <= 0) {
            return 0;
        }
        if (index < 7) {
            return index;
        }

        int[] result = new int[index];
        result[0] = 1;
        int twoIndex = 0;
        int threeIndex = 0;
        int fiveIndex = 0;

        for (int i = 1; i < index; i++) {
            result[i] = minOfThree(result[twoIndex] * 2, result[threeIndex] * 3, result[fiveIndex] * 5);
            if (result[i] == result[twoIndex] * 2) {
                twoIndex ++;
            }
            if (result[i] == result[threeIndex] * 3) {
                threeIndex ++;
            }
            if (result[i] == result[fiveIndex] * 5) {
                fiveIndex ++;
            }
        }

        return result[result.length - 1];
    }

    private int minOfThree(int two, int three, int five) {
        int tempMin = two < three ? two : three;
        tempMin = tempMin < five ? tempMin : five;
        return tempMin;
    }
}
