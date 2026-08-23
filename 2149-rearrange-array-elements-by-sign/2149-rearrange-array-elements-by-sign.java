class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posArr[] = new int[nums.length / 2];
        int negArr[] = new int[nums.length / 2];
        int j = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                negArr[k] = nums[i];
                k++;
            } else {
                posArr[j] = nums[i];
                j++;
            }
        }
        j = 0;
        k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = posArr[j];
                j++;
            } else {
                nums[i] = negArr[k];
                k++;
            }
        }

        return nums;
    }
}