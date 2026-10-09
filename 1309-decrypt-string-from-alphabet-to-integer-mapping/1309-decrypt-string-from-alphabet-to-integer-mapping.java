class Solution {
    public String freqAlphabets(String s) {
        char ch[]=new char[26];

        StringBuilder ans= new StringBuilder("");
        for(int i=0;i<ch.length;i++){
            ch[i]= (char) ('a'+i);
        }

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='#'){
                int count=0;
                StringBuilder st=new StringBuilder("");
                while(count != 2){
                   st.append(s.charAt(i-1));
                   i--;
                   count++; 
                }

                st.reverse();

                int idx= Integer.parseInt(st.toString());
                ans.append(ch[idx-1]);
            }
            else{
                int idx=s.charAt(i)-'0';
                ans.append(ch[idx-1]);
            }
        }

        StringBuilder res=new StringBuilder("");

        for(int i= ans.length()-1;i>=0;i--){
            res.append(ans.charAt(i));
        }

        return res.toString();
    }
}