
import java.util.*;
public class MinimumCommonValue {
    public static int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        int result=-1;
        for(int num : nums1){
            set.add(num);
        }
        for(int num: nums2){
            if(set.contains(num)){
                result =num;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
       int [] nums1 = {1, 2, 3};
        int [] nums2 = {2, 4};
        System.out.println(getCommon(nums1,nums2));
    }
}
