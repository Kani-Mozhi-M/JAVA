public class Intervals {
    // sum up all the numbers that lay in the given interval.
    //using recursion
    public static void main(String[] args) {
        int num1=5;
        int num2=10;
        int sum=getsum(0,num1,num2);
        System.out.println("the sum is " +sum);
    }
    public static int getsum(int sum,int num1,int num2)
    {
        if (num1 > num2) {
            return sum;
        }
        return num1 + getsum(sum,num1+1,num2);
    }
}
