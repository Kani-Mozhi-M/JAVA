public class Permutations {
    public static void main(String[] args) {
        int n = 4, r = 3, fact1 = 1, fact2 = 1;

        for (int i = n; i > 1; i--) {
            fact1 = fact1 * i;
        }
        for (int i = Math.abs(n - r); i > 1; i--) {
            fact2 = fact2 * i;
        }
        int permut = fact1 / fact2;
        System.out.println(permut);

    }


}
