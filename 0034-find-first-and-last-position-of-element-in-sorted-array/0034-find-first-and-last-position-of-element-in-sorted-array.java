class Solution {
    public int[] searchRange(int[] nums, int target) {
        int targetArr[] = { -1, -1 };

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         if(targetArr[0]==-1){
        //             targetArr[0]=i;
        //         }
        //         targetArr[1]=i;
        //     }
        // }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                targetArr[0] = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                targetArr[1] = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return targetArr;
    }
}