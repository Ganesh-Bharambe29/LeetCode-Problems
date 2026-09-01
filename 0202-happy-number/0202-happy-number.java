class Solution {
    public static int happy(int num){
        int res=0;
        while(num > 0){
            int rem = num % 10;
            res = res + ( rem * rem);
            num /= 10;
        }

        return res;
    }
    public boolean isHappy(int n) {
        while(n != 1 && n != 4){
            n=happy(n);
        }

        return n==1;
    }
}