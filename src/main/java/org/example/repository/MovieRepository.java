package org.example.repository;

import org.example.model.Movie;
import java.util.List;

public interface MovieRepository {
    void save(Movie movie);
    void addMovie(Movie movie);
    void updateMovie(Movie movie);
    void deleteMovie(int id);
    Movie getMovieById(int id);
    List<Movie> getAllMovies();
    List<Movie> searchMovies(String query);
    List<Movie> getRecommendedMovies(int userId);
}