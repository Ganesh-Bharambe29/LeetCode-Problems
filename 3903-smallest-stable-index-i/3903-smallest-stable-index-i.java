class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=nums[0];
        int l=0;

        for(int i=0;i<nums.length;i++){
            while(l <= i){
                max=Math.max(max,nums[l]);
                l++;
            }

            int min=nums[i];
            int m=i;
            while(m<=nums.length-1){
                min = Math.min(min,nums[m]);
                m++;
            }

            if((max-min) <= k){
                return i;
            }
        }

        return -1;
    }
}