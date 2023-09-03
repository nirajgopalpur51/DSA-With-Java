public class arrayTripletPairSum {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int sum=180;
        for(int i=0 ; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (sum == (arr[i] + arr[j] + arr[k])) {
                        System.out.println("(" + arr[i] + "," + arr[j] + ","+arr[k] +")");
                    }
                }
            }
        }
    }
}
