package Github;
import java.util.*;
public class twoSum {
    public int[] twoSum(int[] nums, int target) {

        // int arr[]=new int[2];
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i]+nums[j]==target){
        //             arr[0]=i;
        //             arr[1]=j;
        //         }
        //     }
        // }
        // return arr;

        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],i);
        }

        // Searching
        for(int i=0; i<nums.length; i++){
            int num=nums[i];
            int rem=target-num;
            if(map.containsKey(rem)){
                int index=map.get(rem);
                if(index==i){
                    continue;
                }
                return new int[]{i,index};
            }
        }
        return new int[]{};

    }
}
