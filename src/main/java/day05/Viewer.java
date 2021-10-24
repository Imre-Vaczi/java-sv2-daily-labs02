package day05;

public class Viewer{
    public void  watchMovie(Movie movie, int rating){
        movie.rate(rating);
    }

    public static void main(String[] args) {
        Viewer viewer = new Viewer();
        Movie movie = new Movie("Pi", 1998);
        viewer.watchMovie(movie,4);
        System.out.println(movie.getAvgOfRates());
    }
}