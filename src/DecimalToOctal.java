public class DecimalToOctal {
    public static void main(String[] args) {
        int num = 214, i = 0;
        int[] octal = new int[10];
        while (num != 0) {
            int rem = num % 8;
            octal[i++] = rem;
            num = num / 8;
        }
        for (int j = i - 1; j >= 0; j--) System.out.print(octal[j]);

    }
}
