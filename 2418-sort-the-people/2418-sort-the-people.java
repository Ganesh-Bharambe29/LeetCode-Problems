class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map=new HashMap<>();
        String arr[]=new String[names.length];

        for(int i=0;i<heights.length;i++){
            map.put(heights[i],names[i]);
        }

        Arrays.sort(heights);
        
        int j=0;
        for(int i=heights.length-1;i >= 0;i--){
            String name=map.get(heights[i]);
            arr[j]=name;
            j++;
        }

        return arr;
    }
}