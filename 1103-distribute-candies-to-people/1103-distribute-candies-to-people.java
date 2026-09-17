class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int candy[]=new int[num_people];
        
        int i = 0;
        int j = 1;

        while (candies > 0) {

            if (i == num_people) {
                i = 0;
            }

            if (candies >= j) {
                candy[i] += j;
                candies -= j;
            } else {
                candy[i] += candies;
                candies = 0;
            }

            i++;
            j++;
        }
        
        return candy;
    }
}