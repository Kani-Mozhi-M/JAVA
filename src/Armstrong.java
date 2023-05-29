public class Armstrong {
    public static void main(String[] args) {
        int num = 371;

        int order=length1(num);
        if(armstrongnumber(num,order)){
            System.out.println(num + " " +"is a armstrong number");
        }
        else
            System.out.println(num + " " +"is not a armstrong number");

    }
    public static int length1(int num){
        int count=0;
         while (num != 0){
             count++;
             num=num/10;
         }
         return count;
    }
    public static boolean armstrongnumber(int num,int order){
        int sum = 0,digit,temp;
        temp=num;
        while (temp != 0)
        {
             digit =temp%10;
             sum += (int)Math.pow(digit,order);
             temp /= 10;
        }
        return sum == num;

    }

}
