package movies;

import java.util.Arrays;

public class Movie {
    private String name;
    private String category;


    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }

//    public void setNameAndCat(Movie name, Movie category) {
//        this.name = name;
//        this.category = category;
//
//    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static void showAllMovies(Movie[] movies) {

        for (Movie movie : movies) {
            System.out.println(movie.getName() + " | " + movie.getCategory());
        }
    }

    public static void showTheseMovies(Movie[] movies, String category) {


        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie.getName() + " | " + movie.getCategory());
            }
        }
    }
}
