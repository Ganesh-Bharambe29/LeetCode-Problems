class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;

        for(int i=0;i<nums.size();i++){
            int bit = i;

            int count=0;
            while(bit > 0){
                if((bit & 1)== 1){
                    count++;
                }

                bit = bit >> 1;
            }

            if(count == k){
                sum += nums.get(i);
            }
        }

        return sum;
    }
}