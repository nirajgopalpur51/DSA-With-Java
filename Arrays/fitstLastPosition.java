public class fitstLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        arr[0] = arr[1] = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                arr[0] = i;
                while (i < nums.length && nums[i] == target) {
                    i++;
                }
                arr[1] = i - 1;

                break;
            }
        }

        return arr;
    }
}
