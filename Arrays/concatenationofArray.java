package Github;

public class concatenationofArray {
    public static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2*n];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i];

        }
        for(int i=0; i<nums.length; i++){

            ans[i + n] = nums[i];
        }
        return ans;
    }
   
}
