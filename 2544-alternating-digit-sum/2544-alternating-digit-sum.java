class Solution {
    public int alternateDigitSum(int n) {
        int count = 0;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            if (count % 2 == 0) {
                sum += rem;
            } else {
                sum -= rem;
            }
            n /= 10;
            count++;
        }

        if (count % 2 == 0) {
            sum = -sum;
        }

        return sum;
    }
}