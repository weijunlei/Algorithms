package coinchange;

/**
 * @author : Qingfeng
 * @date : 2018/6/23
 */
public class Main {
    public static void main(String[] args) {
        CoinChange coinChange = new CoinChange();
        int[] nums = {2};
        System.out.println(coinChange.coinChange(nums, 3));
    }
}
