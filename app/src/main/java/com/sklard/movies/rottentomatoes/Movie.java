package com.sklard.movies.rottentomatoes;

import java.util.ArrayList;

/**
 * Created by sklard on 10/26/15.
 */
public class Movie {
    public String posterUrl;
    public String title;
    public float criticScore;

    public Movie(String posterUrl, String title, float criticScore) {
        this.posterUrl = posterUrl;
        this.title = title;
        this.criticScore = criticScore;
    }

    public String getCriticScore() {
        return criticScore + "%";
    }

    public static ArrayList<Movie> getFakeMovies() {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("url", "How to Succeed in Business", 45.0f));
        return movies;
    }
}
