
import java.util.Scanner;

public class uniqueElement {

    public static int unique(int arr[]){
        int ans=0;
        for(int i=0; i<arr.length; i++){
            ans=ans^arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(unique(arr));
    }
}
