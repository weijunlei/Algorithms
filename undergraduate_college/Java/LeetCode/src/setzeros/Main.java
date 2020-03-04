package setzeros;

/**
 * @author : Qingfeng
 * @date : 2018/6/25
 */
public class Main {
    public static void main(String[] args){
        int[][] nums = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
    };
        SetZeros setZeros = new SetZeros();
        setZeros.setZeros(nums);

        for (int[] i : nums){
            for(int j : i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
