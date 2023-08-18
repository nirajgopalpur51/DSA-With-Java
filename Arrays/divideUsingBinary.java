package Array;

public class divideUsingBinary {
    public static  long divisorUsingBin(long dividend,long divisor){
        long s=0;
        long e=Math.abs(dividend);
        long mid=s+(e-s)/2;
        long ans=0;
        while(s<=e){
            if(Math.abs(mid*divisor)==Math.abs(dividend)){
                ans=mid;
                break;
            }
            if(Math.abs(mid*divisor)>Math.abs(dividend)){
                e=mid-1;
            }
            else{
                s=mid+1;
                ans=mid;
            }
            mid=s+(e-s)/2;
        }
        if(dividend>0 && divisor>0 || dividend<0 && divisor<0){
            return ans;
        }
        else{

        return -ans;
        }
    }
    public static void main(String[] args) {
        int dividend=-2147483648;
        int divisor=-1;
        long ans=divisorUsingBin(dividend,divisor);
        System.out.println(ans);

    }
}
