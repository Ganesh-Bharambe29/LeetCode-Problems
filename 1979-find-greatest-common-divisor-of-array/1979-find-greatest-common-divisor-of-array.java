class Solution {
    public int findGCD(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            smallest = Math.min(smallest, nums[i]);
            largest = Math.max(largest, nums[i]);
        }

        while (largest % smallest != 0) {
            int temp = largest % smallest;
            largest = smallest;
            smallest = temp;
        }

        return smallest;

    }
}