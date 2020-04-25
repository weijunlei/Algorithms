package lc_322_coinChange;

class Solution {
    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0){
            return -1;
        }

        int[] dps = new int[amount + 1];
        for(int i = 1; i <= amount; i++){
            dps[i] = amount + 1;
            for(int coin: coins){
                if (i - coin >= 0){
                    dps[i] = Math.min(dps[i], dps[i - coin] + 1);
                }
            }
        }
        return dps[amount] > amount ? -1 : dps[amount];
    }
}