package Array;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int arr1[]={1,2,4,5,6};
        int arr2[]={1,2,2,5,5,5,5};
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr2[j]=Integer.MIN_VALUE;
                    System.out.print(arr1[i]+" ");
                    break;
                }
            }
        }
    }
}
