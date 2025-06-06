// implemnt thread using runnable interface
class MyRunnable implements Runnable {
    private String file;

    public MyRunnable(String file) {
        this.file = file;
    }

    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(file + " downloading..." + i * 20 + "%");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        System.out.println("downloaded " + file);
    }
}
class intro1 {
    public static void main (String args[] ){
        MyRunnable r1 = new MyRunnable("A");
        MyRunnable r2 = new MyRunnable("B");
        Thread t1 = new Thread(r1); // Create thread for file A
        Thread t2 = new Thread(r2); // Create thread for file B
        t1.start(); // Start thread for file A
        t2.start(); // Start thread for file B
        
    }
}