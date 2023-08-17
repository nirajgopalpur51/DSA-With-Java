package Github;

public class searchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int mid=(s+e)/2;
        while(s<=e){
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            mid=(s+e)/2;
        }
        return s;
    }
    public static void main(String[] args) {
        int num[]={1,3,5,6};
        System.out.println(searchInsert(num,7));
    }
}
