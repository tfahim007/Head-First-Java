package Threads;

/**
 * @author Tahmidul Islam
 */
public class ThreadDemo {
    public static void show(){
        System.out.println(Thread.currentThread().getName());
        for (int i=0;i<10;i++){
            Thread thread = new Thread(new DownloadFIleTask());
            thread.start();
        }
    }

    public static void main(String[] args) {
        show();
    }
}
