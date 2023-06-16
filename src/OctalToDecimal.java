public class OctalToDecimal {
    public static void main(String[] args) {
        int num = 521;
        int i = 0, octalsum = 0;

        while (num != 0) {
            int rem = num % 10;
            octalsum += Math.pow(8, i) * rem;
            i++;
            num = num / 10;
        }
        System.out.println("decimal number " + octalsum);
    }
}

