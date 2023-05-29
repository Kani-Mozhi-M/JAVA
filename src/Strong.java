public class Strong {
    public static void main(String[] args) {
        int num=140;
        //1!+4!+5!=145
        if (getStrong(num))
            System.out.println(num+" is a strong number");
        else
            System.out.println(num+" is not a strong number");
    }
    public static int fact(int digit){
        if (digit == 1) {
            return digit;
        }
        return digit * fact(digit-1);
    }
    public static boolean getStrong(int num){
            int temp =num,sum=0,digit;
            while (temp != 0)
            {
                digit =temp % 10;
                sum += fact(digit);
                temp=temp/10;
            }
            return  sum == num;

    }

}
