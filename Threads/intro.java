class downloadFile extends Thread {

    private String file;

    public downloadFile(String file) {
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

class intro {

    public static void main(String args[]) {
        downloadFile f1 = new downloadFile("A");
        downloadFile f2 = new downloadFile("B");
        f1.start(); // Start thread for file A
        f2.start(); // Start thread for file B
        for(int i = 0; i< 30;i++){
            System.out.println("Loading the main ui");
            try {
                
            Thread.sleep(200);
            } catch (Exception e) {
            }
        }
        System.out.println("Loaded the main ui");
    }
}
// today rcb won the mathch 