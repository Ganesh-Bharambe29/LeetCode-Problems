class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder str=new StringBuilder("");

        int i=0;
        int j=s.length()-1;

        while( i < s.length()){
            if(!Character.isLetter(s.charAt(i))){
                str.append(s.charAt(i));
                i++;
            
            }
            else if(!Character.isLetter(s.charAt(j))){
                j--;
            }
            else{
                str.append(s.charAt(j));
                i++;
                j--;
            }
        }

        return str.toString();
    }
}