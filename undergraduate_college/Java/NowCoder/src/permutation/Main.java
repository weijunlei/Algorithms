package permutation;

import java.util.ArrayList;

/**
 * @author : Qingfeng
 * @date : 2018/6/10
 */
public class Main {
    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        ArrayList<String> result = permutation.permutation("abs");

        System.out.println(result.toString());
    }
}
