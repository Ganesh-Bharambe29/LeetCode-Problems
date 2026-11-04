class Solution {
    public String convertToBase7(int num) {
        String res="";

        if(num == 0){
            return "0";
        }
        
        if(num<0){
            res +="-";
            num=-num;
        }

        String ans="";

        while(Math.abs(num) > 0){
            int rem = num % 7;
            ans += String.valueOf(rem);
            num=num/7;
        }

        StringBuilder sb=new StringBuilder(ans);

        return res + sb.reverse().toString();
    }
}