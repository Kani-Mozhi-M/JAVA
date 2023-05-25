public class Palindrome {
    public static void main(String[] args) {
        int n = 121;
        if (isPalindrome(n) == n) {
            System.out.println(n + " is a palindrome number");
        }
        else
            System.out.println(n + " is not a palindrome number");
    }
    public static int isPalindrome(int n){
        int sum=0;
        while (n != 0)
        {
            int lastno = n%10;
            sum = (sum*10) + lastno ;
            n=n/10;
        }
        return sum;
    }
}
