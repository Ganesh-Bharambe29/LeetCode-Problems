class Solution {
    public String reverseWords(String s) {
        char ch[]=s.toCharArray();

        StringBuilder str=new StringBuilder("");
        StringBuilder newStr=new StringBuilder("");

        for(int i=0;i<s.length();i++){
            if (ch[i] == ' ') {
                String st = revStr(str.toString());
                newStr.append(st);
                newStr.append(" ");
                str.setLength(0);
            } 
            else {
                str.append(ch[i]);
            }
        }

        String st = revStr(str.toString());
        newStr.append(st);
        
        return newStr.toString();
    }

    public String revStr(String s){
        StringBuilder str=new StringBuilder("");
        for(int i=s.length()-1;i>=0;i--){
            str.append(s.charAt(i));
        }

        return str.toString();
    }
}