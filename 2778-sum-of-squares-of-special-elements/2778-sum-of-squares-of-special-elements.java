class Solution {
    public int sumOfSquares(int[] nums) {
        int ans=0;

        int j=1;
        for(int i=0;i<nums.length;i++){
            if(nums.length % j == 0){
                ans += nums[i] * nums[i];
            }
            j++;
        }

        return ans;
    }
}