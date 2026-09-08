class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;
        int j = 0;
        for (int i = 0; i < g.length && j < s.length; i++) {
            if (g[i] <= s[j]) {
                child++;
                j++;
            } else {
                j++;
                i--;
            }
        }

        return child;
    }
}