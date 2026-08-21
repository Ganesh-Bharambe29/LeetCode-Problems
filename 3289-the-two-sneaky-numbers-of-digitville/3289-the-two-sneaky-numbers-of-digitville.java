class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);

        int temp[]=new int[2];
        int k=0;
        for(int i=0; i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                temp[k]=nums[i];
                k++;
            }
        }

        return temp;
    }
}