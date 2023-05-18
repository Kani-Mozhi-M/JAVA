import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        //to get input from user
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 1ST NUMBER");
        int num1=sc.nextInt();
        System.out.println("ENTER 2ND NUMBER");
        int num2=sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " IS THE GREATER NUMBER");
        }
        else
            System.out.println(num2 + " IS THE GREATER NUMBER");
    }
}
