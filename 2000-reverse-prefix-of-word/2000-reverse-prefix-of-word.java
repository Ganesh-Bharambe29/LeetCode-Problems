class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> s=new Stack<>();
        String str="";
        int occur=-1;

        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == ch){
                occur=i;
                break;
            }
        }

        for(int i=0;i<=occur;i++){
            s.push(word.charAt(i));
        };

        while(!s.isEmpty()){
            str += s.pop();
        }   

        for(int i=occur+1;i<word.length();i++){
            str += word.charAt(i);
        }

        return str;
    }
}
        