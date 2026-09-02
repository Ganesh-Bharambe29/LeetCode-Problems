class Solution {
    public int mirrorDistance(int n) {
        String num = "";
        int curr = n;
        while (n > 0) {
            int rem = n % 10;
            num += rem;
            n /= 10;
        }

        int newNum = Integer.parseInt(num);

        return Math.abs(newNum - curr);
    }
}