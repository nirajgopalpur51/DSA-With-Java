public class findMissingWithDuplicates {
    public static void findMissing(int a[]){
        for(int i=0; i<a.length; i++){
            int index=Math.abs(a[i]);
            if(a[index-1]>0){
                a[index-1]*=-1;
            }
        }
        for(int i=0; i<a.length; i++){
            if(a[i]>0){
                System.out.println(i+1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,5,3,3,4,};
        findMissing(arr);
    }
}
