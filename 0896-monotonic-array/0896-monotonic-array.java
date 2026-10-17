class Solution {
    public boolean isMonotonic(int[] nums) {
        return montoneIncreasing(nums) || monotoneDecreasing(nums);
    }

    private boolean montoneIncreasing(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                return false;
            }
        }

        return true;
    }

    private boolean monotoneDecreasing(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] < nums[i+1]){
                return false;
            }
        }

        return true;
    }
}