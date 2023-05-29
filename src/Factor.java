public class Factor {
    public static void main(String[] args) {
        int n=100;
        System.out.print("Factors of "+n+" are "+" ");
        getFactors(n);
    }

    private static void getFactors(int n) {
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if (n%i == 0)
            {
                if (i == n/i) //i=10 its becomes true 100/10 == 10
                {
                    System.out.print(i+" ");
                }
                else
                    System.out.print(i +" "+n/i+" ");
            }


        }
    }
}
