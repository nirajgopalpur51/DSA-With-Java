public class rotateArray {
    public static void reverse(int nums[] ,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        rotate(nums,3);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
