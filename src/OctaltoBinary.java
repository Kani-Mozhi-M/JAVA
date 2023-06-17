public class OctaltoBinary {
    public static void main(String[] args) {
        int octal =12;
        int decimal = convertoctal(octal);
        convertdecimal(decimal);
    }

    private static int convertoctal(int octal) {
        int decimal = 0, i = 0;
        while (octal != 0) {
            int rem = octal % 8;
            decimal += Math.pow(8, i) * rem;
            octal = octal / 8;
            i++;
        }
        return decimal;
    }

    private static void convertdecimal(int decimal) {
        int[] binary = new int[20];
        int i = 0;
        while (decimal != 0) {
            int rem = decimal % 2;
            binary[i++] = rem;
            decimal /= 2;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }
    }
}
