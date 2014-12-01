package Airport;

public class Airplane implements Runnable {

    private Airport airport;
    private static int counter;
    private int num;

    public Airplane(Airport p_airport) {
        this.airport = p_airport;
        counter++;
        num = counter;
    }

    private void takeTechService() throws InterruptedException {
        this.airport.getTechServ();
        Thread.sleep(5000);
        this.airport.freeTechServ();
    }

    private void loadPassengers() throws InterruptedException {
        Thread.sleep(4000);
    }

    private void takeOff() throws InterruptedException {
        this.airport.getStrip();
        Thread.sleep(9000);
        this.airport.freeStrip();
    }

    public String getName() {
        return "Airplane # " + this.num;
    }

    @Override
    public void run() {
        try {
            this.takeTechService();
            this.loadPassengers();
            this.takeOff();
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }

}
