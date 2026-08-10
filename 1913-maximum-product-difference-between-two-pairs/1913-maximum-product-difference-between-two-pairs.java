class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

        int smallest=nums[0];
        int secondsmallest=nums[1];
        int largest =nums[nums.length-1];
        int secondlargest=nums[nums.length-2];

        return (largest * secondlargest)-(smallest * secondsmallest);

    }
}