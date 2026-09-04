class Solution {
    public int arrangeCoins(int n) {
        int compRows=0;
        int i=1;
        
        while(n >= i){
            n=n-i;
            compRows += 1;
            i++;
        }

        return compRows;
    }
}