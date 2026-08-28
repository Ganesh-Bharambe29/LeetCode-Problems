class Solution {
    public int minElement(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            int val=0;
            while(curr > 0){
                int rem = curr%10;
                val += rem;
                curr /= 10;
            }

            nums[i]=val;
        }

        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            min = Math.min(min,nums[i]);
        }

        return min;
    }
}