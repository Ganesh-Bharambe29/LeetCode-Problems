class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res=new ArrayList<>();

        for(int i=left;i<=right;i++){
            if(isSelfDividingNum(i)){
                res.add(i);
            }
        } 

        return res;
    }

    private boolean isSelfDividingNum(int num){
        int currNum=num;

        while(num!= 0){
            int rem=num%10;
            if(rem ==0 || currNum % rem != 0){
                return false;
            }

            num /= 10;
        }

        return true;
    }
}