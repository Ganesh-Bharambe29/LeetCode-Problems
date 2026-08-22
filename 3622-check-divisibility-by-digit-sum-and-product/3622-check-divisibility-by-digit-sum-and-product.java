class Solution {
    public boolean checkDivisibility(int n) {
        int val = n;
        if (n == 0) {
            return false;
        }

        int digitSum = 0;
        int digitProd = 1;
        while (n > 0) {
            int rem = n % 10;
            digitSum += rem;
            digitProd *= rem;
            n /= 10;
        }

        int res = digitSum + digitProd;

        return val % res == 0;
    }
}