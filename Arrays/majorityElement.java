package Github;

public class majorityElement {
    public static int majorityElement(int[] nums) {
        int cand=0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(count==0){
                cand=nums[i];
            }
            if(cand==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return cand;
    }
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
}
