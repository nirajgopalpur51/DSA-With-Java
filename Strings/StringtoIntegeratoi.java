package String;

public class StringtoIntegeratoi {
    public int myAtoi(String s) {
        s = s.trim();

        if (s.length() == 0) {
            return 0;
        }

        boolean neg = false;
        long ans = 0;
        int i = 0;

        if (s.charAt(0) == '-') {
            neg = true;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int dig = s.charAt(i) - '0';
            ans = ans * 10 + dig;

            if (neg) {
                if (-ans < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            } else {
                if (ans > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
            }
            i++;
        }

        if (neg) {
            ans = -ans;
        }

        return (int) ans;
    }
}
