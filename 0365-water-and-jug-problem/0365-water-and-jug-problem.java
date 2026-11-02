class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if(target > x + y) return false;

        HashSet<String> vis=new HashSet<>();
        return waterJug( x,y, 0,0,target,vis);
    }

    private boolean waterJug(int cpA,int cpB,int a,int b, int tar, HashSet<String> vis){
        String state=a +","+b;

        if(vis.contains(state)){
            return false;
        }

        vis.add(state);

        if(a==tar || b==tar ||a+b==tar){
            return true;
        }

        if(waterJug(cpA,cpB,cpA,b,tar,vis)){
            return true;
        }

        if(waterJug(cpA,cpB,a,cpB,tar,vis)){
            return true;
        }

        if(waterJug(cpA,cpB,a,0,tar,vis)){
            return true;
        }

        if(waterJug(cpA,cpB,0,b,tar,vis)){
            return true;
        }

        int pour=Math.min(a,cpB-b);
        if(pour >0 && waterJug(cpA,cpB,a-pour,b+pour,tar,vis)){
            return true;
        }

        pour=Math.min(cpA-a,b);
        if(pour>0 && waterJug(cpA,cpB,a+pour,b-pour,tar,vis)){
            return true;
        }

        return false;
    }
}