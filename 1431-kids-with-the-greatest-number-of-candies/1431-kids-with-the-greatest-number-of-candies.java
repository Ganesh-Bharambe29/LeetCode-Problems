class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = 0;
        for (int i = 0; i < candies.length; i++) {
            maxCandy = Math.max(candies[i], maxCandy);
        }

        List<Boolean> res = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            if (extraCandies + candies[i] >= maxCandy) {
                res.add(true);
            } else {
                res.add(false);
            }
        }

        return res;
    }
}