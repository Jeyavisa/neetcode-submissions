class Solution {
    public int reverse(int x) {
        int MIN=Integer.MIN_VALUE;
        int MAX=Integer.MAX_VALUE;
        int sum=0;
        while(x!=0){
            int digit=x%10;
            x/=10;
            if(sum>MAX/10 ||(sum==MAX/10 && digit>MAX%10))
            return 0;
            if(sum<MIN/10 ||(sum==MIN/10 && digit<MIN%10))
            return 0;
            sum=(sum*10)+digit;
        }
        return sum;
        
    }
}
