package Array;

public class SecondSmallest {
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 1};
        int min = arr[0], second = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                second = min;
                min = arr[i];
            }
        }
        System.out.println("first smallest " + min + " second smallest is " + second);
    }
}
