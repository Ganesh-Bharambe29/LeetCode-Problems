class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);

        int diff[]=new int[arr.length-1];

        for(int i=0;i<arr.length-1;i++){
            diff[i]= Math.abs(arr[i]-arr[i+1]);    
        }

        for(int i=0;i<diff.length-1;i++){
            if(diff[i] != diff[i+1]){
                return false;
            }
        }

        return true;
    }
}