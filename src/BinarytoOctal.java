public class BinarytoOctal {
    public static void main(String[] args) {
        int binary =  1010;
        int decimal = convertbinary(binary);
        convertdecimal(decimal);
    }

    private static int convertbinary(int binary) {
        int decimal = 0, i = 0;
        while (binary != 0) {
            int rem = binary % 10;
            decimal += Math.pow(2, i) * rem;
            binary = binary / 10;
            i++;
        }
        return decimal;
    }

    private static void convertdecimal(int decimal) {
        int[] oct = new int[20];
        int i = 0;
        while (decimal != 0) {
            int rem = decimal % 8;
            oct[i++] = rem;
            decimal /= 8;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(oct[j]);
        }
    }
}
