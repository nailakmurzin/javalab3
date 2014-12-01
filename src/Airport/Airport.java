package Airport;

public class Airport {

    private static final Object monitor = new Object();

    private boolean techServFree;
    private boolean stripFree;

    public Airport() {

    }

    public void getTechServ() throws InterruptedException {
        synchronized (monitor) {
//            while (!techServFree) {
//                monitor.wait();
//            }
//            this.techServFree = false;
            System.out.println("Занял тех поддержку " + Thread.currentThread().getName());
        }

        this.techServFree = false;
    }

    public void freeTechServ() {
        synchronized (monitor) {
//            this.techServFree = true;
//            monitor.notifyAll();
            System.out.println("Освободил тех поддержку " + Thread.currentThread().getName());
        }

        this.techServFree = true;
    }

    public void getStrip() throws InterruptedException {
        synchronized (monitor) {
//            while (!stripFree) {
//                monitor.wait();
//            }
//            this.stripFree = false;
            System.out.println("Занял полосу " + Thread.currentThread().getName());
        }

        this.stripFree = false;

    }

    public void freeStrip() {
        synchronized (monitor) {
//            this.stripFree = true;
//            monitor.notifyAll();
            System.out.println("Освободил полосу " + Thread.currentThread().getName());
        }
        this.stripFree = true;

    }
}
