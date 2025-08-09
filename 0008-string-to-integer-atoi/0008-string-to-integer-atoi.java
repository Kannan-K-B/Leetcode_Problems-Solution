
public class Solution {
    public static int myAtoi(String s) {
        s = s.trim(); // Remove leading and trailing whitespace
        if (s.isEmpty()) {
            return 0; // Empty string
        }

        int sign = 1; // Default positive sign
        int i = 0;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            i++;
        }

        long result = 0; // Use long to handle overflow
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;
            if (result > Integer.MAX_VALUE) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            i++;
        }

        return (int) (result * sign);
    }

    public static void main(String[] args) {
        String input = "   -42"; // Example input
        int result = myAtoi(input);
        System.out.println("Converted integer: " + result);
    }
}
