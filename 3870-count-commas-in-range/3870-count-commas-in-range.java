class Solution {
    public int countCommas(int n) {
        int comma=0;

        if(n>=1000){
            comma += (n-999);
        }

        if(n>100000){
            comma += (n-99999);
        }

        return comma;
    }
}