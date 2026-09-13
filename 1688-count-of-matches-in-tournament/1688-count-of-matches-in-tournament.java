class Solution {
    public int numberOfMatches(int n) {
        int matches = 0;
        int advance = 0;
        int m = n;

        while (m > 1) {
            int currmatch = 0;
            int curradvance = 0;
            if (m % 2 == 0) {
                currmatch = m / 2;
                curradvance = m / 2;
            } else {
                currmatch = (m - 1) / 2;
                curradvance = (m - 1) / 2 + 1;
            }
            matches += currmatch;
            m = curradvance;
        }

        return matches;
        //return n-1; in optimal case;
    }
}