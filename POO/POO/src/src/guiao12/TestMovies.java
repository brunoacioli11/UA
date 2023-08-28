package guiao12;

import java.util.*;
import java.io.*;

public class TestMovies {
    public static void main(String[] args) throws IOException {
        List<Movie> movieList = new ArrayList<>();
        File f = new File("C:/POO/guiaoPOO/POO/src/guiao12/movies.txt");
        Scanner sc = new Scanner(f);
        sc.nextLine();

        while(sc.hasNextLine()) {
            String[] aux = sc.nextLine().split("\t");
            movieList.add(new Movie(aux[0], Float.parseFloat(aux[1]),aux[2], aux[3], Integer.parseInt(aux[4])));
        }
        String header = String.format("%-40s %-5s %-7s %-5s %-15s", "Name", "Score", "Rating", "Genre", "Running time");
        System.out.println(header);
        for(Movie movie: movieList) {
            System.out.println(movie);
        }

        System.out.println("\nFilmes por ordem decrescente de pontuação");
       
        SortedSet<Movie> movieSetSortedDescending=new TreeSet<>(Comparator.comparing(Movie::getScore).reversed());
        movieSetSortedDescending.addAll(movieList);
        System.out.println(header);

        for(Movie movieSorted: movieSetSortedDescending){
            System.out.println(movieSorted);
        }

        System.out.println("\nFilmes por ordem crescente de running time");

        SortedSet<Movie> movieSetSortedAscending = new TreeSet<>(Comparator.comparing(Movie::getRunningTime));
        movieSetSortedAscending.addAll(movieList);

        for(Movie movieSorted2: movieSetSortedAscending){
            System.out.println(movieSorted2);
        }




    }
}
