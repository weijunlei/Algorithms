package reorderarray;

/**
 * @author : Qingfeng
 * @date : 2018/6/4
 */
public class Main {
    public static void main(String[] args) {
        ReOrderArray reOrderArray = new ReOrderArray();
        int[] myArray = {1,2,3,4,5,6};
        reOrderArray.reOrderArray(myArray);
        for (int i : myArray) {
            System.out.println(i);
        }
    }
}
