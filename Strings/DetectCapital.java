package Github;

public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        int caps=0,low=0,first=0;
        for(int ch:word.toCharArray()){
            if(ch>=65 && ch<=90){
                caps++;
                if(first==0){
                    first=1;
                }
            }
            else{
                low++;
                if(first==0){
                    first=2;
                }
            }
        }
        if(caps==0 || low==0 || first==1 && caps==1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        boolean b=detectCapitalUse("FlaG");
        System.out.println(b);

    }
}
