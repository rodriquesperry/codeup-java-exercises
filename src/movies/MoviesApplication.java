package movies;


import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();
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
    }
}
