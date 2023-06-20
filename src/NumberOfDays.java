public class NumberOfDays {
    public static void main(String[] args) {
        int month = 2, yr = 2024;
        if ((month == 2) && ((yr % 4 == 0) && (yr % 100 == 0)) || (yr % 400 == 0)) {
            System.out.println("no of days is 29");
        } else if (month == 2) {
            System.out.println("no of days is 28");
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("no of days is 31");
        } else
            System.out.println("no of days is 30");
    }
}
