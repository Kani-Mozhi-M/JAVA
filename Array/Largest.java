package Array;

public class Largest {
    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 10};
        int max = arr[0];
        for (int j = 0; j < arr.length; j++) {

            if (max < arr[j]) {
                max = arr[j];
            }
        }
        System.out.println("largest number is : " + max);
    }
}
