package day04;

public class Car {
    private double gasIn;
    private double distanceTaken;

    public void setDistanceTaken(double distanceTaken) {
        this.distanceTaken = distanceTaken;
    }
    public void setGasIn(double gasIn){
        this.gasIn = gasIn;
    }
    public double distanceCalculator(){
        return (100/this.distanceTaken) * this.gasIn;
    }
}
