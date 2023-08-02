public class Pattern {
    public static void main(String[] args) {
        int n = 4;
        pattern7(n);
    }

    private static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("!" + " ");
            }
            System.out.println();
        }
    }

    private static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("!" + " ");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void pattern4(int n) {
        for (int i = 1; i < 2 * n; i++) {
            int col = i > n ? 2 * n - i : i;
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {
        for (int i = 1; i < 2 * n; i++) {
            int col = i > n ? 2 * n - i : i;
            int totalspace = i == n ? 0 : n - col;
            for (int j = 1; j <= totalspace; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    private static void pattern7(int n) {
        for (int i = 1; i < 2* n; i++) {
            int col = i > n ? 2 * n - i : i;
            for (int j = 1; j <= n-col; j++) {
                System.out.print("  ");
            }
            for (int j = col; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= col; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
