package Github;

public class numberofGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int n=0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j] && i < j){
                    n++;
                }
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }
}
