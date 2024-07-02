package Array;

public class ThreeConsecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {
        int sum = 0;
        int maxSum = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==1){
                sum = sum + 1;
                maxSum = Math.max(sum,maxSum);
            }
            else{
                sum = 0;
            }
        }

        if(maxSum>=3){
            return true;
        }

        return false;
    }
}
