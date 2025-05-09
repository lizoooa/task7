public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(int seats) {
        numberOfSeats = seats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void start() {
        System.out.println("Samochód uruchamia silnik");
    }

    @Override
    public void stop() {
        System.out.println("Samochód wyłącza silnik");
    }
}