package Threads;

/**
 * @author Tahmidul Islam
 */
public class DownloadFIleTask implements Runnable {
    @Override
    public void run() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("Downloading a file ");
        System.out.println(Thread.currentThread().getName());
    }
}
