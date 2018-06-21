package differentpath;

/**
 * @author : Qingfeng
 * @date : 2018/6/21
 */
public class DifferentPath {
    public int uniquePaths(int m, int n){
        if (m == 0 || n == 0 || m + n <= 2){
            return 0;
        }

        double son = 1;
        double mother = 1;
        int minIndex = Math.min(m, n);
        for (int i = 1; i <= minIndex - 1; i++) {
            System.out.println(mother);
            System.out.println(son);
            mother *= i;
            son *= (m + n - 1 - i);
        }

        return (int)(son / mother);
    }
}
