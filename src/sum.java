public class sum {
    public static void main(String[] args) {
        //sum of n numbers
        int num = 10;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("sum of first " + num + " natural numbers are :" + sum);
    }
}