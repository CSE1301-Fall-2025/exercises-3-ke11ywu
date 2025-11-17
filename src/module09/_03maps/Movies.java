package module09._03maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Movies {

    private Map<String, Integer> movies;

    public Movies() {
        movies = new HashMap<>();
    }

    public void addMovie(String movieName, int rating){
        movies.put(movieName, rating);
    }

    public void changeRating(String movieName, int newRating){
        movies.put(movieName, newRating);
    }

    public void removeMovie(String movieName){
        movies.remove(movieName);
    }

    public void listMovies(){
        for (Entry<String, Integer> movie : movies.entrySet()){
            System.out.println(movie.getKey() + ": " + movie.getValue());
        }
    }

    public int getRating(String movieName){
        return movies.get(movieName);
    }

    public static void main(String[] args) {

        // update rating, add/remove movie, view all movies+ratings, view rating of specific
        // movie

    }
}
