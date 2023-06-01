public class HarshadNum {
    public static void main(String[] args) {
        int x = 24;
        //2+4 =6
        //24%6 == 0 ,harshad number
        harshad(x);
    }
    public static void harshad(int x) {
        int sum =0,temp=x;
        while (x != 0){
             int lastdigit=x%10;
             sum += lastdigit;
             x= x/10;
        }
        if (temp % sum == 0) {
            System.out.println("Harshad Number");
        }
        else
            System.out.println(" not a Harshad Number");

    }
}
