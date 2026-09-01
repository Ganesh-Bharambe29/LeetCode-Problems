class Solution {
    public boolean isAnagram(String s, String t) {

        char sStr[] = s.toCharArray();
        char tStr[] = t.toCharArray();

        Arrays.sort(sStr);
        Arrays.sort(tStr);

        String newS = new String(sStr);
        String newT = new String(tStr);

        if(newS.length() != newT.length()) return false;
        for (int i = 0; i < newS.length(); i++) {
            if (newS.charAt(i) != newT.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}