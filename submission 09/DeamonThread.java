package submission09;

public class DeamonThread {
	public static void main(String[] args) {
        // Creating a daemon thread
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread is running");
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Setting the thread as daemon
        daemonThread.setDaemon(true);

        // Starting the daemon thread
        daemonThread.start();

        // Main thread
        System.out.println("Main thread is running");

        // Let the main thread sleep for a while to observe the daemon thread
        try {
            Thread.sleep(5000); // Sleep for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Main thread completing
        System.out.println("Main thread completed");
    }
}
