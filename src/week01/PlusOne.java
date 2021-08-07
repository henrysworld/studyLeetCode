package week01;

public class PlusOne {
    public static void main(String[] args) {

        int[] digits = {9,9,9,1};
        int[] res  = plusOne(digits);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >=0 ; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0)
                return digits;
        }

        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }
}
