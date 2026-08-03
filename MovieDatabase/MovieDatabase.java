package MovieDatabase;

import java.util.ArrayList;

public class MovieDatabase {

    private ArrayList<Movie> movies = new ArrayList<>();

    public void addMovie(String title, String genre, double rating){
        Movie movie = new Movie(title, genre, rating);
        movies.add(movie);
    }

    public void removeMovie(String title){
        if(movies.isEmpty()){
            System.out.println("No movies available.");
            return;
        }

        for(int i=0; i<movies.size(); i++){
            Movie movie = movies.get(i);
            if(title.equalsIgnoreCase(movie.getTitle())){
                movies.remove(i);
                System.out.println("Removed.");
                return;
            }
        }

        System.out.println("Movie not found.");
    }

    public void searchMovie(String title){

        if(movies.isEmpty()){
            System.out.println("No movies available.");
            return;
        }

        for(Movie movie: movies){
            if(title.equalsIgnoreCase(movie.getTitle())){
                System.out.println("Found!");
                System.out.println(movie);
                return;
            }
        }

        System.out.println("Movie not found.");

    }

    public void displayMovies(){
        if(movies.isEmpty()){
            System.out.println("No movies available.");
            return;
        }

        int a = 1;

        for(Movie movie: movies){
            System.out.println(a + ".\n" + movie);
            a++;
        }

    }

    public void displayMoviesAboveRating(double rating){
        if(movies.isEmpty()){
            System.out.println("No movies available.");
            return;
        }

        int a=1;

        for(Movie movie: movies){
            if(movie.getRating() > rating){
                System.out.println(a + ".\n" + movie);
                a++;
            }
        }
    }

}
