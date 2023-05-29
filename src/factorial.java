public class factorial {
    public static void main(String[] args) {
        int num=8;
        int result=fact(num);
        System.out.println(num + " factorial is " + result);
    }
    public static int fact(int num){
        if (num == 1) {
            return num;
        }
        return num * fact(num-1);
    }
}
