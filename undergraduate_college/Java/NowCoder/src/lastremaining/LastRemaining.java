package lastremaining;

/**
 * @author : Qingfeng
 * @date : 2018/6/28
 */
public class LastRemaining {
    public int lastRemaining(int n, int m){
        if (n <= 0 || m <= 0){
            return -1;
        }

        int[] hasVisit = new int[n];
        for (int i = 0; i < hasVisit.length; i++){
            hasVisit[i] = 0;
        }
        int callCount = 0;
        int tempCount = 0;
        int tempIndex = 0;
        while(callCount != n){
            while (hasVisit[tempIndex] != 0){
                tempIndex = (tempIndex + 1) % n;
            }
            tempCount++;
            if (tempCount == m){
                hasVisit[tempIndex] = 1;
                callCount += 1;
                tempCount = 0;
            }
            tempIndex = (tempIndex + 1) % n;
        }

        return (tempIndex + n - 1) % n;
    }

    public int lastRemainingChange(int n, int m){
        if (n == 0){
            return -1;
        }
        int result = 0;
        for(int i = 2; i <= n; i++){
            result = (result + m) % i;
        }

        return result;
    }
}
