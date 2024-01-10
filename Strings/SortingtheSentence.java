public class SortingtheSentence {
    public static String sortSentence(String s) {
        String str[] = s.split(" ");
        String arr[] = new String[str.length];

        for(String t: str){
            int n = t.length();
            int pos = t.charAt(n-1)-48;
            arr[pos-1] = t.substring(0,n-1);
        }

        StringBuilder sb = new StringBuilder();
        for(String i : arr){
            sb.append(i);
            sb.append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
       String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
}
