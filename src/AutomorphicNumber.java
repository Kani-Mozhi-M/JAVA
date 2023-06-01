public class AutomorphicNumber {
    public static void main(String[] args) {
        int x = 5;
        automorphic(x);
    }

    private static void automorphic(int x) {
        int square = x * x;
        int lastdigit = square % 10;
        if (lastdigit == x) {
            System.out.println("Num: "+ x + ", Square: " + square + " - is Automorphic");
        }
        else
            System.out.println("Num: "+ x + ", Square: " + square + " - is not Automorphic");
    }

}
