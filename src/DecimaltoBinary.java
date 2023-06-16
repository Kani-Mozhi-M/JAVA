public class DecimaltoBinary {
    public static void main(String[] args) {
        int num = 12;
        int[] binary = new int[10];
        int index1 = 0;

        while (num != 0) {
            int rem = num % 2;
            binary[index1++] = rem;
            num = num / 2;
        }
        for (int i = index1 - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }

    }
}
