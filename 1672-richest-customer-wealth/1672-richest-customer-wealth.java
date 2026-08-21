class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth =0;

        for(int i=0;i<accounts.length;i++){
            int currwealth=0;
            for(int j=0;j<accounts[0].length;j++){
                currwealth += accounts[i][j];
            }

            wealth = Math.max(wealth,currwealth);
        }

        return wealth;
    }
}