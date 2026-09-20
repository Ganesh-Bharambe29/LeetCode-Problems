class Solution {
    public int reverseDegree(String s) {
        int revDeg = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            int revVal = 'z' - ch + 1;

            revDeg += (i + 1) * revVal;
        }

        return revDeg;
    }
}