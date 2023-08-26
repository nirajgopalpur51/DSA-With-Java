package Array;

public class max {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 60};
        int current = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if(arr[i]>current){
               current=arr[i];
            }
        }
        System.out.println(current);

    }
}
