public class PerfectSquare {
    public static void main(String[] args) {
        int x=49;
        // 49 =7*7 perfect
        // 55 = 5*11 not perfect
        perfect(x);
    }

    private static void perfect(int x) {
        int squareroot = (int)Math.sqrt(x);
        if (squareroot * squareroot == x) {
            System.out.println("it's a Perfect square Number");
        }
        else
            System.out.println("it's not a Perfect square Number");
    }
}
