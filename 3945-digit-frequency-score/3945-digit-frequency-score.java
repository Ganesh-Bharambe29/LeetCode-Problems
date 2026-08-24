class Solution {
    public int digitFrequencyScore(int n) {
        int result=0;

        while(n>0){
            int rem = n%10;
            result += rem;
            n /= 10;
        }

        return result;
    }
}