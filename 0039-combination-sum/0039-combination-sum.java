class Solution {
    public void comSum(int idx,int arr[],int target,ArrayList<Integer> ds,List<List<Integer>> ans){
        int n=arr.length;
        if(idx==n){
            if(target==0){
                ans.add(new ArrayList(ds));
            }
            return;
        }

        if(arr[idx] <= target){
            ds.add(arr[idx]);
            comSum(idx,arr,target-arr[idx],ds,ans);
            ds.remove(ds.size()-1);
        }
        comSum(idx+1,arr,target,ds,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>(); 
        ArrayList<Integer> ds=new ArrayList<>();
        comSum(0,candidates,target,ds,ans);

        return ans;   
    }
}