package Github;

public class excelSheetColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int result=0;

        for(int i=0;i<columnTitle.length();i++)
        {
            result*=26;
            // columnTitle[i] --> YE CURRENT ELEMENT KA ASCII CODE DEGA
            result+=columnTitle.charAt(i)-'A'+1;
        }
        return result;
    }

    public static void main(String[] args) {
        int a=titleToNumber("AB");
        System.out.println(a);
    }
}
