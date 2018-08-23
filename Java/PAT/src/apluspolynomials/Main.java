package apluspolynomials;

import java.util.Scanner;

/**
 * @author : Qingfeng
 * @date : 2018/8/22
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float[] result = new float[1001];
        for(int i = 0; i < result.length; i++){
            result[i] = 0.0f;
        }

        int m, n, index;
        m = in.nextInt();
        for(int i = 0; i < m; i++){
            index = in.nextInt();
            result[index] = in.nextFloat();
        }
        n = in.nextInt();
        for(int i = 0; i < n; i++){
            index = in.nextInt();
            result[index] += in.nextFloat();
        }

        int nums = 0;
        for(int i = 0; i < 1001; i++){
            if (result[i] != 0.0f){
                nums++;
            }
        }
        System.out.print(nums);
        for(int i = 1000; i >= 0; i--){
            if (result[i] != 0.0f){
                System.out.printf(" %d %.1f", i, result[i]);
            }
        }
    }
}
