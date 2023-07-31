package Array;

public class SumOfArray {
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 1, 2, 4};
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println(sum);
    }
}
