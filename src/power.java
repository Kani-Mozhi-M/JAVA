import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base");
        int base = sc.nextInt();
        System.out.println("enter exponent");
        int exponent = sc.nextInt();
        int temp = 1, exp;
        exp = exponent;
        while (exp != 0) {
            temp *= base;
            exp--;
        }
        System.out.println(base + " power " + exponent + " is " + temp);

    }
}
