public class AbundantNumber {
    public static void main(String[] args) {
        int x = 18;
        /* sum of the factors of the given number is greater than the given number
        therefore it is an Abundant Number
         */
        int sumOfFactors = factors(x);
        if (sumOfFactors > x) {
            System.out.println("It's an Abundant Number");
        }
        else
            System.out.println("It's not an Abundant Number");
    }

    private static int factors(int x) {
        int sum = 0;
        for (int i = 1; i <= x/2 ; i++) {
            if (x % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
