package Array;

public class oddOccuringBinary {
    public static int solve(int arr[]){
        int s=0;
        int e=arr.length-1;
        int mid=s+(e-s)/2;

        while(s<=e){
            if(s==e){
                return s;
            }
            if(mid%2==0){
                if(arr[mid]==arr[mid+1]){
                    s=mid+2;
                }
                else{
                    e=mid;
                }
            }
            else {
                if(arr[mid]==arr[mid-1]){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
            mid=s+(e-s)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={3,3,7,7,10,11,11};
        int ans=solve(arr);
//        System.out.println("At index "+ans);
        System.out.println(arr[ans]);
    }
}
