public class DecimalToHexa {
    public static void main(String[] args) {
        int num = 1457, i = 0;
        char[] hex = new char[100];

        while (num != 0) {
            int rem = num % 16;
            //0-9
            if (rem < 10) {
                hex[i] = (char) (rem + 48);
                i++;
            }
            //A-E
            else {
                hex[i] = (char) (rem + 55);
                i++;
            }
            num=num/16;
        }
        for (int j = i-1; j >=0 ; j--) {
            System.out.print(hex[j]);
        }

    }
}
