class Solution {
    public int strStr(String haystack, String needle) {
        char hay[] = haystack.toCharArray();
        char need[] = needle.toCharArray();

        int i = 0, j = 0;

        while (i < hay.length) {
            if (hay[i] == need[j]) {
                int start = i;

                while (i < hay.length && j < need.length && hay[i] == need[j]) {
                    i++;
                    j++;
                }

                if (j == need.length) {
                    return start;
                }

                i = start + 1;
                j = 0;
            } else {
                i++;
            }
        }

        return -1;
    }
}