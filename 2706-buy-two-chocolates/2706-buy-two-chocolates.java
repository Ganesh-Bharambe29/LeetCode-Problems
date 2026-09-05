class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int currMoney=money;
        int chocolate=0;
        for(int i=0;i<prices.length;i++){
            if(currMoney >= prices[i]){
                currMoney -= prices[i];
                chocolate ++;
            }

            if(chocolate == 2){
                return currMoney;
            }
        }
        return money;
    }
}