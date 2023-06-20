public class AddFractions {
    public static void main(String[] args) {
        int numerator = 0, denominator = 0, x = 0;
        int num1 = 1, deno1 = 3;
        int num2 = 3, deno2 = 9;
        int hcf = 1;
        if (deno1 == deno2) {
            numerator = num1 + num2;
            denominator = deno1;
        } else {
            numerator = (num1 * deno2) + (num2 * deno1);
            denominator = deno1 * deno2;
        }

        System.out.println(numerator + " " + denominator);

        for (int i = 1; i <= numerator && i <= denominator; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                hcf = i;
            }
        }
        System.out.println("(" + numerator / hcf + " / " + denominator / hcf + ")");
    }
}




