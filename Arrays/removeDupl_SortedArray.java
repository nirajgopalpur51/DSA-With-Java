package Github;

public class removeDupl_SortedArray {
    public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int n:nums){
            if(i<2 || n!=nums[i-2]){
                nums[i++]=n;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3};
        removeDuplicates(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
