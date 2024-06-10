import java.util.*;

public class HeightChecker {
    public static int heightChecker(int[] heights) {

        int count =0;

        ArrayList<Integer> arr = new ArrayList<>();

        for(int e : heights){
            arr.add(e);
        }

        Collections.sort(arr);

        for(int i=0; i<heights.length; i++){
            if(heights[i] != arr.get(i)){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
       int [] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
}
