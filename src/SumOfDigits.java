public class SumOfDigits {
    public static void main(String[] args) {
        int num = 3456;
        int sum = 0;
        while (num != 0) {
            int lastdigit = num % 10;
            sum += lastdigit;
            num = num / 10;
        }
        System.out.println("SUM OF DIGITS IS " + sum);
    }
}
