class Solution {
    public boolean checkString(String s) {
        boolean ans = true;
        int i = 0;
        int count = 0;

        for (int y = 0; y < s.length(); y++) {
            if (s.charAt(y) == 'a')
                count++;
        }

        int arrA[] = new int[count];
        int arrB[] = new int[s.length() - count];

        int k = 0;
        int j = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'a') {
                arrA[j] = i;
                j++;
            } else {
                arrB[k] = i;
                k++;
            }
            i++;
        }

        if (arrA.length > 0 && arrB.length > 0) {
            if (arrA[arrA.length - 1] > arrB[0]) {
                ans = false;
            }
        }

        return ans;
    }
}