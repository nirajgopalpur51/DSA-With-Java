package Array;

public class binaryInTwoArray {
   public static   boolean BinarySearch(int arr[][], int rows, int cols, int target){
       int s=0;
       int e=rows*cols-1;
       int mid=s+(e-s)/2;
       while (s<=e){
           int rowIndex=mid/cols;
           int colIndex=mid%cols;
           if(arr[rowIndex][colIndex]==target){
               return true;
           }
           if(arr[rowIndex][colIndex]>target){
               e=mid-1;
           }
           else{
               s=mid+1;
           }
           mid=s+(e-s)/2;
       }
       return false;
    }

    public static void main(String[] args) {
       int arr[][]={
            {1,2,3,4},
            {6,9,4,7},
            {6,8,4,7},
            {6,9,8,7},
            {9,8,4,7}
        };
       int rows=5;
       int cols=4;
       int target=4;
       boolean ans=BinarySearch(arr,  rows,  cols,  target);
       if(ans){
           System.out.println("found");
       }
       else {
           System.out.println("Not found");
       }
    }
}
