public class CapitalizetheTitle {
    public static String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        for(String s : title.toLowerCase().split(" ")){
            if(s.length() > 2)
                sb.append(Character.toUpperCase(s.charAt(0)) + s.substring(1) + " ");
            else
                sb.append( s+ " ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        System.out.println(capitalizeTitle("capiTalIze tHe titLe"));
    }
}
