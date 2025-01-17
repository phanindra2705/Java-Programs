// Thread by extending the Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread (Extending Thread class): " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }
}

// Thread by implementing the Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread (Implementing Runnable): " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        // Creating a thread by extending the Thread class
        MyThread thread1 = new MyThread();

        // Creating a thread by implementing the Runnable interface
        Thread thread2 = new Thread(new MyRunnable());

        // Starting the threads
        thread1.start();
        thread2.start();

        // Main thread logic
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted!");
            }
        }
    }
}
