package Github;

public class climbingStairs {
    public static int climb(int n) {
        if(n<=3){
            return n;
        }
        int a=3;int b=2;
        for(int i=0; i<n-3; i++){
            a=a+b;
            b=a-b;
        }
        return a;
    }
    public static void main(String[] args) {
        int a=climb(4);
        System.out.println(a);
    }
}
