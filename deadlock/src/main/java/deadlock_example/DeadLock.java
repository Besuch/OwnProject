package deadlock_example;

public class DeadLock {
    private final Square square = new Square();
    private final Triangle triangle = new Triangle();

    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();

        deadLock.methodOne();
        deadLock.methodTwo();
    }

    private void methodOne() {
        Thread threadOne = new Thread(() -> {
            synchronized (square) {
                System.out.println(Thread.currentThread().getName() + ": get Square Monitor");
                square.perimeterSquare(5, 5);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    System.out.println(ie.getMessage());
                }

                System.out.println(Thread.currentThread().getName() + ": try to get Triangle Monitor");
                synchronized (triangle) {
                    triangle.perimeterTriangle(5, 5, 5);
                }
            }
        });
        threadOne.start();
    }

    private void methodTwo() {
        Thread threadTwo = new Thread(() -> {
            synchronized (triangle) {
                System.out.println(Thread.currentThread().getName() + ": get Triangle Monitor");
                triangle.perimeterTriangle(5, 5, 5);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    System.out.println(ie.getMessage());
                }

                System.out.println(Thread.currentThread().getName() + ": try to get Square Monitor");
                synchronized (square) {
                    square.perimeterSquare(5, 5);
                }
            }
        });
        threadTwo.start();
    }
}