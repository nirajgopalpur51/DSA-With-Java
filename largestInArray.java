public class largestInArray {
    public static void largest(int arr[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }

    public static void main(String[] args) {
        int arr[]={1,5,3,9,8,0};
        largest(arr);
    }
}
