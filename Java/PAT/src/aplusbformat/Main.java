package aplusbformat;

import java.util.Scanner;

/**
 * @author : Qingfeng
 * @date : 2018/8/22
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        String result = String.valueOf(a + b);
        int resultLength = result.length();
        for(int i = 0; i < resultLength; i++){
            System.out.print(result.charAt(i));
            if (result.charAt(i) == '-'){
                continue;
            }
            if ((i + 1 ) % 3 == resultLength % 3 && i != resultLength - 1){
                System.out.print(",");
            }
        }
    }
}
