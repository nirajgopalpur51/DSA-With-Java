package Github;
import java.util.*;
public class containsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap();
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                return true;
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1,1,1,3,3,4,3,2,4,2};
        boolean b=containsDuplicate(nums);
        System.out.println(b);
    }
}
