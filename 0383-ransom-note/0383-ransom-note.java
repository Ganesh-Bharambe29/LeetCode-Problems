class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>map=new HashMap<>();

        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);

            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int freq=0;

        for(int j=0;j<ransomNote.length();j++){
            char ch=ransomNote.charAt(j);

            if(map.containsKey(ch) && map.get(ch) > 0){
                map.put(ransomNote.charAt(j),map.get(ch)-1);
                freq++;
            }
        }

        return freq==ransomNote.length();
    }
}