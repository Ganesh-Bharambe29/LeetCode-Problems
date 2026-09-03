class Solution {

    public static int getDigits(int num){
        int newNum=0;;
        while(num >0){
            int rem = num%10;
            newNum +=rem;
            num/=10;
        }

        return newNum; 
    }
    public int addDigits(int num) {
        int res = getDigits(num);
        
        while( res >= 10){
            res=getDigits(res);
        }

        return res;
    }
}