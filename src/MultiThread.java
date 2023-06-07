public class MultiThread {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Hello world!");
        Runnable  first =new fThread();

        SecThread sec=new SecThread();

        Thread t1= new Thread(first);
        t1.start();
        sec.start();
        sec.join();

        if (t1.isAlive())
        {
            System.out.println("alive");
        }
        System.out.println("bye");
    }
    public static class fThread implements Runnable{
        @Override
        public void run() {
            for (int i = 10; i <= 15; i++) {
                System.out.println("updating");
            }
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println("interrupted");
            }
        }
    }
    public static class  SecThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i <= 5; i++) {
                System.out.println(i);
            }
            try {
                Thread.sleep(2000);
            }
            catch (Exception e){
                System.out.println("interrupted");
            }
        }
    }
}
