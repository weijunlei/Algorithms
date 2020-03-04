package coinchange;

/**
 * @author : Qingfeng
 * @date : 2018/6/23
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount){
        if (coins == null || coins.length == 0) {
            return -1;
        }

        int[] amoutsList = new int[amount + 1];
        for(int i = 0; i < amount + 1; i++){
            amoutsList[i] = -1;
        }

        for (int i = 1; i < amount + 1; i++){
            int minCount = -1;
            for (int j = coins.length - 1; j >= 0; j --) {
                if (i - coins[j] > 0 && amoutsList[i - coins[j]] != -1){
                    if (minCount == -1 || amoutsList[i - coins[j]] + 1 <= minCount){
                        minCount = amoutsList[i - coins[j]] + 1;
                    }
                }
                else if (i - coins[j] == 0){
                    minCount = 1;
                }
            }
            amoutsList[i] = minCount;
        }
        return amoutsList[amount];
    }
}
