class Solution {
    public int maxDepth(String s) {
        int operation = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                operation++;
            } else if (s.charAt(i) == ')') {
                operation--;
            }

            max = Math.max(operation, max);
        }

        return max;
    }
}