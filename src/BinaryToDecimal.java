public class BinaryToDecimal {
    public static void main(String[] args) {
        int binarynum = 1100;
        binary(binarynum);
    }

    public static void binary(int num) {
        int i = 0, binarysum = 0;

        while (num != 0) {
            int rem = num % 10;
            binarysum += Math.pow(2, i) * rem;
            i++;
            num = num / 10;
        }
        System.out.println("decimal number " + binarysum);
    }
}
