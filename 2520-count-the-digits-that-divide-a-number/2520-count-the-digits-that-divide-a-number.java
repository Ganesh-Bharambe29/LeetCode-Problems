class Solution {
    public int countDigits(int num) {
        int res = 0;
        int val = num;
        while(num > 0){
            int rem = num%10;

            if(val % rem == 0){
                res +=1;
            }

            num /= 10;
        }

        return res;
    }
}