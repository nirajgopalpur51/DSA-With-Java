package Github;
import java.util.*;
public class MinimumTimeDifference {
    public static int  findMinDifference(List<String> timePoints) {

        int[] minutes = new int[timePoints.size()];

        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < timePoints.size(); i++) {
            String curr = timePoints.get(i); // Use get() to access elements in a List
            int hours = Integer.parseInt(curr.substring(0, 2)); // Use parseInt and substring correctly
            int min = Integer.parseInt(curr.substring(3, 5)); // Use parseInt and substring correctly
            int totalMinutes = hours * 60 + min; // Calculate total minutes
            minutes[i] = totalMinutes;
        }
        Arrays.sort(minutes);

        for (int i = 1; i < minutes.length; i++) {
            int diff = minutes[i] - minutes[i - 1]; // Calculate the difference with the previous time
            mini = Math.min(mini, diff);
        }

        int lastDiff = (minutes[0] + 1440) - minutes[minutes.length - 1]; // Calculate the difference with the last time
        mini = Math.min(mini, lastDiff);

        return mini;
    }

    public static void main(String[] args) {
        String arr[]={"23:59","00:00"};
        System.out.println(findMinDifference(List.of(arr)));
    }
}
