package Array;

public class Smallest {
    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 10};
        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {

            if (min > arr[j]) {
                min = arr[j];
            }
        }
        System.out.println("smallest number is : " + min);
    }
}
