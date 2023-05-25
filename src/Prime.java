public class Prime {
    public static void main(String[] args) {
        int num1=2,num2=10;
        for (int i = num1; i <= num2 ; i++) {
            if (isprime(i)) {
                System.out.println(i +" ");
            }
        }

    }
    public static boolean isprime(int num){
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num/2 ; i++) {
            if (num % i == 0) {
                return  false;
            }
        }
        return true;
    }
}
