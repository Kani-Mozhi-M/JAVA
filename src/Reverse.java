public class Reverse {
    public static void main(String[] args) {
        int n=123;
        int sum=0;
        while (n != 0)
        {
            int lastno = n%10;
            sum = (sum*10) + lastno ;
            n=n/10;
        }
        System.out.println("reversed number is : " + sum);
    }
}
