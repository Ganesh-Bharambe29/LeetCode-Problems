class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int arriveA = convert(arriveAlice);
        int leaveA = convert(leaveAlice);
        int arriveB = convert(arriveBob);
        int leaveB = convert(leaveBob);

        int start = Math.max(arriveA, arriveB);
        int end = Math.min(leaveA, leaveB);

        if (start > end) {
            return 0;
        }

        return end - start + 1;
    }

    public int convert(String date) {
        String[] months = {
            "01", "02", "03", "04", "05", "06",
            "07", "08", "09", "10", "11", "12"
        };

        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        int total = day;

        for (int i = 0; i < month - 1; i++) {
            total += days[i];
        }

        return total;
    }
}