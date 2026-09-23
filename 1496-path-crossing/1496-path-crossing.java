class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> set=new HashSet<>();
        int x=0;
        int y=0;

        set.add(x +","+ y);

        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='E'){
                x++;
            }
            else if(path.charAt(i)=='W'){
                x--;
            }
            else if(path.charAt(i)=='N'){
                y++;
            }
            else{
                y--;
            }

            String position=x +","+ y;

            if(set.contains(position)){
                return true;
            }

            set.add(position);
        }

        return false;
    }
}