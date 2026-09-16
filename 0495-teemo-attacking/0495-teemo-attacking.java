class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int seconds = 0;

        for (int i = 0; i < timeSeries.length; i++) {
            
            if (i == 0) {
                seconds += duration;
            } else {
                seconds += Math.min(duration, timeSeries[i] - timeSeries[i - 1]);
            }
        }

        return seconds;
    }
}