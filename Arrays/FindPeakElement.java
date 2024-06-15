public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE;
        int index = 0;

        int i=0;
        for(int n : nums){
            if(n > maxSoFar){
                maxSoFar = n;
                index = i;
            }
            i++;
        }
        return index;
    }
}
