public class Multi extends Thread{
    public void run()
    {
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        Multi obj = new Multi();
        obj.start();
        System.out.println("Programming in Java");
    }
    
}
