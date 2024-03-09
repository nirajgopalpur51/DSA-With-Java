package Array;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int [] nums ={2,7,11,15};
        int arr[] = twoSum(nums,9);
        for (int i:arr){
            System.out.println(i);
        }

    }
}
