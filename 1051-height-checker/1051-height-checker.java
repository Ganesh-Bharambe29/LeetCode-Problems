class Solution {
    public int heightChecker(int[] heights) {
        int sort[]=new int[heights.length];

        for(int i=0;i<heights.length;i++){
            sort[i]=heights[i];
        }

        Arrays.sort(sort);

        int count=0;

        for(int i=0;i<heights.length;i++){
            if(heights[i] != sort[i]){
                count++;
            }
        }

        return count;
    }
}