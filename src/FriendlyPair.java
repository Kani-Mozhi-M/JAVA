public class FriendlyPair {
    public static void main(String[] args) {
        int num1 =6,num2=28;
        int sum1 = factors(num1);
        int sum2 = factors(num2);
        /*
        Input : 6 28
        Output : Yes, they are a friendly pair
        Explanation : The factors of 6 and 28 except the numbers themselves are 1, 2, 3 and 1, 2, 4, 7, 14 respectively.
        Now the sum of factors of both the numbers are 6 and 28 respectively.
        When we divide the sums with the numbers we get 1 and 1 respectively.
        As the ratio of both the number match, they are considered as a friendly pair.
         */

        if (num1 / sum1 == num2 / sum2 ){
            System.out.println("friendly pair");
        }
        else
            System.out.println("not friendly pair");

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
