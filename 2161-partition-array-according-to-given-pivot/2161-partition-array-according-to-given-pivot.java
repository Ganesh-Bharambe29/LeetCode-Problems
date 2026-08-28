class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lpiv = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> gpiv = new ArrayList<>();
        int result[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                lpiv.add(nums[i]);
            } else if (nums[i] == pivot) {
                equal.add(nums[i]);
            } else {
                gpiv.add(nums[i]);
            }
        }

        int j = 0;

        for (int i = 0; i < lpiv.size(); i++) {
            result[i] = lpiv.get(i);
            j++;
        }

        for (int i = 0; i < equal.size(); i++) {
            result[j] = equal.get(i);
            j++;
        }

        for (int i = 0; i < gpiv.size(); i++) {
            result[j] = gpiv.get(i);
            j++;
        }

        return result;
    }
}