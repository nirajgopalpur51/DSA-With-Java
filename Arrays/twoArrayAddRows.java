package Array;

public class twoArrayAddRows {
    public static void main(String[] args) {
        int arr[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("Cols wise");
        for(int i=0; i<3; i++){
            int sum=6;
            for(int j=0; j<3; j++){
//                sum=sum+arr[j][i];  //Cols wise Adding
                if(arr[i][j]==sum){
                    System.out.println("Yes");
                    break;
                }

            }

//            System.out.println(sum);
        }
//        System.out.println("Rows wise");
//        for(int i=0; i<3; i++){
//            int sum=0;
//            for(int j=0; j<3; j++){
//                sum=sum+arr[i][j];  //Rows wise Adding
//            }
//            System.out.println(sum);
//        }
    }
}
