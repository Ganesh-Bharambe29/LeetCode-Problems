class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;

        for(int i=left;i<=right;i++){
            if(countSetBits(i)){
                count++;
            }
        }

        return count;
    }

    private boolean isPrime(int num) {

        if(num <= 1) return false;

        for(int i = 2; i*i <= num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }

    private boolean countSetBits(int num){
        int count=0;

        while(num >0){
            if((num & 1) == 1){
                count++;
            }

            num >>=1;
        }

        return isPrime(count);
    }
}