package day04;

public class GasStation {
    private double price;

    public GasStation(double price){
        this.price = 300;
    }
    public double refueling(Car car, double gasIn){
        car.setGasIn(gasIn);
        return price * gasIn;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setDistanceTaken(50);
        car.setGasIn(20);
        GasStation gasStation = new GasStation(00);
        System.out.println(gasStation.refueling(car, 20));
    }
}
