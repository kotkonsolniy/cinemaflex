package org.example.implementation;

import org.example.repository.RatingRepository;
import org.example.model.Rating;
import java.sql.*;

public class SQLiteRatingRepository implements RatingRepository {
    private final Connection connection;

    public SQLiteRatingRepository(Connection connection) {
        this.connection = connection;
        createTable();
    }

    private void createTable() {
        try (Statement stmt = connection.createStatement()) {
            stmt.execute("CREATE TABLE IF NOT EXISTS ratings (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "user_id INTEGER NOT NULL," +
                    "movie_id INTEGER NOT NULL," +
                    "score INTEGER NOT NULL," +
                    "comment TEXT," +
                    "FOREIGN KEY(user_id) REFERENCES users(id)," +
                    "FOREIGN KEY(movie_id) REFERENCES movies(id))");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Реализация методов интерфейса
}