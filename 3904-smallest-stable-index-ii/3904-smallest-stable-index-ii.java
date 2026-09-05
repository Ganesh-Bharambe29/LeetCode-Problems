class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int suffMin[]=new int[n];
        int min=nums[n-1];
        suffMin[n-1]=min;

        for(int i=n-2;i>=0;i--){
            min=Math.min(nums[i],min);
            suffMin[i]=min;
        }

        int prefMax=nums[0];
        for(int i=0;i<nums.length;i++){
            prefMax=Math.max(prefMax,nums[i]);

            if((prefMax-suffMin[i]) <= k){
                return i;
            }
        }

        return -1;
    }
}