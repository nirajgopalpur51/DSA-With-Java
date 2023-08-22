package Array;

public class pairSum {
    public static void main(String[] args) {
    int arr[]={10,20,30,20,40,50,60};
    int sum=40;
    for(int i=0 ; i<arr.length; i++){
        for (int j=i+1; j<arr.length; j++){
            if(sum==(arr[i]+arr[j])){
                System.out.println("(" +arr[i]+","+arr[j]+")");
            }
        }
    }

    }

}
