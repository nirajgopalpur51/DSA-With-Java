public class sortColores {
    public static void main(String[] args) {
       public void sortColors(int number[]) {
           int l=0; int m=0; int h=number.length-1;
           while(m<=h){
               if(number[m]==0){
                   int temp=number[l];
                   number[l]=number[m];
                   number[m]=temp;
                   l++;m++;
               }
               else if(number[m]==1){
                   m++;
               }
               else{
                   int temp=number[m];
                   number[m]=number[h];
                   number[h]=temp;
                   h--;
               }
           }
//        }
    }
}
