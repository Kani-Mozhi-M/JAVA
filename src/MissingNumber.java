public class MissingNumber {
    public static void main(String[] args) {
        int[] num ={3,0,1}; // 2 is missing
        int n=missing(num);
        System.out.println("Missing number is "+n);

    }
    public static int missing(int[] num){
        int length1 = num.length;
        int sum=0;

        for (int i = 0; i < length1 ; i++) {
            sum += num[i];
        }

        int missednumber =length1*(length1+1)/2 - sum; //  sum of n numbers - sum of array

        return missednumber;
    }
}
