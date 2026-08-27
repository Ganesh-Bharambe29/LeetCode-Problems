class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> idx=new ArrayList<>();

        for(int i=0;i<words.length;i++){
            String currword=words[i];
            boolean found=false;
            for(int j=0;j<currword.length();j++){
                if(currword.charAt(j)==x){
                    found=true;
                    break;
                }
            }

            if(found==true){
                idx.add(i);
            }
        }

        return idx;
    }
}