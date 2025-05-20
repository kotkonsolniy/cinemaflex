package org.example.repository;
import java.util.List;
import org.example.model.Rating;

public interface RatingRepository {
    void addRating(Rating rating);
    void updateRating(Rating rating);
    void deleteRating(int id);
    Rating getRatingById(int id);
    List<Rating> getRatingsByMovie(int movieId);
    List<Rating> getRatingsByUser(int userId);
}