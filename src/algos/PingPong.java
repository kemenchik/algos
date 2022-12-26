package algos;

public class PingPong {

    private static boolean first = false;

    public static void main(String[] args) {
        Object monitor = new Object();
        new Thread(() -> {
            while (true) {
                synchronized (monitor) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                    if (!first) {
                        try {
                            monitor.wait();
                        } catch (InterruptedException exception) {
                            exception.printStackTrace();
                        }
                    }
                    System.out.println("ping");
                    first = !first;
                    monitor.notify();
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                synchronized (monitor) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                    if (first) {
                        try {
                            monitor.wait();
                        } catch (InterruptedException exception) {
                            exception.printStackTrace();
                        }
                    }
                    System.out.println("pong");
                    first = !first;
                    monitor.notify();
                }
            }
        }).start();
    }
}
