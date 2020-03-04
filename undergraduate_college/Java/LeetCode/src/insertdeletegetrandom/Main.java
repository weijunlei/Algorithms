package insertdeletegetrandom;

/**
 * @author : Qingfeng
 * @date : 2018/8/29
 */
public class Main {
    public static void main(String[] args){
        RandomizedSet randomizedSet = new RandomizedSet();
        System.out.println(randomizedSet.insert(1));
        System.out.println(randomizedSet.remove(2));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.remove(1));
    }
}
