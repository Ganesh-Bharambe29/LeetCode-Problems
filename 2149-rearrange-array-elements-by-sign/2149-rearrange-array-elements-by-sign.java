class Solution {
    public int[] rearrangeArray(int[] nums) {
       int res[]=new int[nums.length];

       int positive=0;
       int negative=1;

       for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                res[negative]=nums[i];
                negative +=2;
            }else{
                res[positive]=nums[i];
                positive +=2;
            }
       }

       return res;
    }
}