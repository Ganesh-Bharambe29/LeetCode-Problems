class Solution {
    public int[] runningSum(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[k];
            k++;
        }

        return nums;
    }
}