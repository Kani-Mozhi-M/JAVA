import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        int hcf=0;

        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        for (int i = 1; i <=(num1/2) || i<= (num2/2); i++) {
            if (num1%i == 0 &&  num2%i == 0) {
                hcf =i;
            }
        }
        System.out.println("hcf of "+num1+" and "+num2+" is "+hcf);

    }
}
