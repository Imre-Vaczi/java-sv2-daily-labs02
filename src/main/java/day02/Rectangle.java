package day02;

public class Rectangle {
    private double aSide;
    private double bSide;

    public Rectangle(double aSide, double bSide){
        this.aSide = aSide;
        this.bSide = bSide;
    }

    public double getaSide(){
        return this.aSide;
    }

    public double getbSide(){
        return this.bSide;
    }

    public void setaSide(double aSide) {
        this.aSide = aSide;
    }

    public void setbSide(double bSide) {
        this.bSide = bSide;
    }

    public double calculateArea(double aSide, double bSide){
        return this.aSide * this.bSide;
    }
}
