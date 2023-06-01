public class Perfect {
    public static void main(String[] args) {
        int num = 28,sum = 0;
        // divisors of 28 is 1,2,4,7,14
        //sum of divisors = actual number..is a perfect number
        for (int i = 1; i <= num/2 ; i++) {
            if (num%i == 0)
            {
                sum += i;
            }
        }
        if (num == sum) {
            System.out.println("Yes, it's a Perfect Number");
        }
        else
            System.out.println( "it's not a Perfect Number");
    }
}
