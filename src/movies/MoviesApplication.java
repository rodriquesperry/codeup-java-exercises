package movies;


import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();
        System.out.println("movies.length = " + movies.length);
        System.out.println("movies[1] = " + movies[1].getName());
        Input input = new Input();
        int userInput;

        do {
            System.out.println("0 = Exit\n1 = Show all Movies\n2 = Show all Drama movies\n3 = Show all Musicals\n4 = Show all Horror movies\n5 = Show all Comedies\n6 = Show all Sifi movies\n7 = Show all Animated movies");
            System.out.println("What would you like to see?");
            userInput = scanner.nextInt();

            if (userInput == 1) {
                Movie.showAllMovies(movies);
            } else if (userInput == 2) {
                Movie.showTheseMovies(movies, "drama");
            } else if (userInput == 3) {
                Movie.showTheseMovies(movies, "musical");
            } else if (userInput == 4) {
                Movie.showTheseMovies(movies, "horror");
            } else if (userInput == 5) {
                Movie.showTheseMovies(movies, "comedy");
            } else if (userInput == 6) {
                Movie.showTheseMovies(movies, "scifi");
            } else if (userInput == 7) {
                Movie.showTheseMovies(movies, "animated");
            }

        } while (userInput != 0);

        System.out.println("Didn't like what you saw?\n Would you like to add a movie to the collection? [y/n]");
        scanner.nextLine();
        String addMovieYN = scanner.nextLine();
        if (addMovieYN.equalsIgnoreCase("y") || addMovieYN.equalsIgnoreCase("yes")) {
            Movie[] moviesPlusOne = Arrays.copyOf(movies, movies.length + 1);
            System.out.println("Enter your movie title.");
            String title = scanner.nextLine();
            moviesPlusOne[moviesPlusOne.length - 1].setName(title);
            System.out.println(title);
        }

        //Increase the size of an Array


        //Add to Array and item
//        moviesPlusOne[moviesPlusOne.length - 1] = "Vacation";
//
//        for (Movie movie : moviesPlusOne) {
//            System.out.println(movie);
//        }
    }
}
