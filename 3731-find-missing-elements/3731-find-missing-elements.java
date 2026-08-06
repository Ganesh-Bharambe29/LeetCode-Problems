class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(nums);
        int si = nums[0];
        int ei = nums[nums.length - 1];

        int idx = 0;
        for (int i = si; i <= ei; i++) {
            if (idx < nums.length && nums[idx] == i) {
                idx++;
            } else {
                list.add(i);
            }
        }

        return list;
    }
}