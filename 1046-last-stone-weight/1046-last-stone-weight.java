class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> weight=new ArrayList<>();

        for(int i=0;i<stones.length;i++){
            weight.add(stones[i]);
        }

        Collections.sort(weight);

        while(weight.size()>1){
            int x=weight.get(weight.size() - 1);
            int y=weight.get(weight.size() - 2);

            weight.remove(weight.size() - 1);
            weight.remove(weight.size() - 1);

            if( x != y){
                weight.add(x-y);
            }

            Collections.sort(weight);
        }

        if(weight.isEmpty()){
            return 0;
        }

        return weight.get(0);
    }
}