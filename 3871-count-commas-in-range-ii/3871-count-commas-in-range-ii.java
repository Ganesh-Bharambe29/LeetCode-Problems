class Solution {
    public long countCommas(long n) {
        long comma =0;
        if (n >= 1000) {
            comma += n - 999;
        }

        if (n >= 1000000) {
            comma += n - 999999;
        }

        if (n >= 1000000000) {
            comma += n - 999999999;
        }

        if (n >= 1000000000000L) {
            comma += n - 999999999999L;
        }

        if (n >= 1000000000000000L) {
            comma += n - 999999999999999L;
        }

        return comma;
    }
}