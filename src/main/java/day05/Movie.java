package day05;

public class Movie {
    private String title;
    private int prodDate;
    private double avgRate;
    private int numOfRating;
    private double sumOfRates;
    private double avgOfRates;

    public Movie(String title, int prodDate){
        this.prodDate = prodDate;
        this.title = title;
    }
    public double rate(double rating){
        numOfRating++;
        sumOfRates = sumOfRates + rating;
        avgRate = (sumOfRates*1.0)/numOfRating;
        return avgRate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setProdDate(int prodDate) {
        this.prodDate = prodDate;
    }

    public void setAvgRate(double avgRate) {
        this.avgRate = avgRate;
    }

    public void setNumOfRating(int numOfRating) {
        this.numOfRating = numOfRating;
    }

    public void setAvgOfRates(double avgOfRates) {
        this.avgOfRates = avgOfRates;
    }

    public String getTitle() {
        return title;
    }

    public int getProdDate() {
        return prodDate;
    }

    public double getAvgRate() {
        return avgRate;
    }

    public int getNumOfRating() {
        return numOfRating;
    }

    public double getAvgOfRates() {
        return avgOfRates;
    }
}
