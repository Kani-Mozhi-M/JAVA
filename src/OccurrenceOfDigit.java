public class OccurrenceOfDigit {
    public static void main(String[] args) {
        int n = 8929499, count = 0;
        int find = 9;
        while (n != 0) {
            int rem = n % 10;
            if (rem == find) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("Occurrence of " + find + " " + "is " + count);
    }
}
