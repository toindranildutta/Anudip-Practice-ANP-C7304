package submission08;

public class ClassMultiThreadingTask1 extends Thread {	// extending thread class
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Task : " + i);
			try {
				Thread.sleep(1000);	
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		ClassMultiThreadingTask1 thread1 = new ClassMultiThreadingTask1();

		thread1.start();
		System.out.println("Main Thread print statement");

	}
}

// ************************************************************

package submission08;

public class ClassMultiThreadingTask2 implements Runnable{
	public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task 2: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

	public static void main(String[] args) {
		ClassMultiThreadingTask2 task2 = new ClassMultiThreadingTask2();
        Thread thread2 = new Thread(task2);

		thread2.start();
		System.out.println("Main Thread print statement");

	}

}

// ************************************************************


