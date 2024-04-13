package submission08;

class InterThread {
    boolean isDataReady = false;

    // Method to produce data
    public synchronized void produceData() {
        System.out.println("Producer is producing data...");
        try {
            Thread.sleep(2000); // Simulating time to produce data
            isDataReady = true;
            System.out.println("Producer has produced data.");
            notify(); // Notify the consumer thread that data is ready
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    // Method to consume data
    public synchronized void consumeData() {
        while (!isDataReady) {
            try {
                System.out.println("Consumer is waiting for data...");
                wait(); // Wait until data is produced
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Consumer is consuming data...");
        isDataReady = false;
        System.out.println("Consumer has consumed data.");
    }
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		final InterThread communication = new InterThread();

        // Producer thread
        Thread producerThread = new Thread(() -> {
            communication.produceData();
        });

        // Consumer thread
        Thread consumerThread = new Thread(() -> {
            communication.consumeData();
        });

        producerThread.start();
        consumerThread.start();

	}

}
