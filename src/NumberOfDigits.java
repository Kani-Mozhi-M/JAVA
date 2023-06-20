public class NumberOfDigits {
    public static void main(String[] args) {
        int n = 12345, len = 0;
//        int digit = (int)(Math.log10(n))+1;
//        System.out.println(digit);

        while (n != 0) {
            int rem = n % 10;
            len++;
            n /= 10;
        }
        System.out.println("Number of digits is " + len);
    }
}
