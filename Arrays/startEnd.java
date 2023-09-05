public class startEnd {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 70,40, 50,60};
        int n=arr.length-1;
        for(int i=0; i<=n; i++){
//            if(i>n){
//                break;
//            }
            if(i==n){
                System.out.println(arr[i]);
            }
            else{
                System.out.println(arr[i]);
                System.out.println(arr[n]);
            }

            n--;
        }
    }
}
