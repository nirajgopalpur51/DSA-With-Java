public class zero_Ones {
    public static void main(String[] args) {
        int arr[]={0,1,1,0,1,0,1,1,1,0,1,1};
        int start=0;
        int end=arr.length-1;
        int i=0;
        while(i!=end){
            if(arr[i]==0){
                arr[i]=arr[start];
                start++;
                i++;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[end];
                arr[end]=temp;
                end--;
            }
        }
        for (int e:arr) {
            System.out.print(e+" ");
        }
    }
}
