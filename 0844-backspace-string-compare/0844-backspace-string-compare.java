class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> newS= new Stack<>();
        Stack<Character> newT=new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(!newS.isEmpty()){
                    newS.pop();
                }
            }else{
                newS.push(s.charAt(i));
            }
        }

        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(!newT.isEmpty()){
                    newT.pop();
                }
            }else{
                newT.push(t.charAt(i));
            }
        }

        while(!newS.isEmpty() && !newT.isEmpty()){
            if(newS.peek() !=newT.peek()){
                return false;
            }
            newS.pop();
            newT.pop();
        }

        return newS.isEmpty() && newT.isEmpty();
    }
}