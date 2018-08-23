package mytest;

import java.util.Scanner;

/**
 * @author : Qingfeng
 * @date : 2018/8/20
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        String result = String.valueOf(a + b);
        for(int i = 0; i < result.length(); i++){
            System.out.printf("%c", result.charAt(i));
            if (result.charAt(i) == '-')
                continue;
            if ((i + 1) % 3 == 0 && i != result.length() - 1)
                System.out.printf(",");
        }
    }
}
