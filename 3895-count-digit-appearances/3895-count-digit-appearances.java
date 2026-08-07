class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];

            if (val == 0 && digit == 0) {
                count++;
            }

            while (val > 0) {
                int rem = val % 10;
                if (rem == digit) {
                    count++;
                }
                val /= 10;
            }
            
        }

        return count;
    }
}