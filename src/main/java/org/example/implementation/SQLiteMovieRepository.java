package org.example.implementation;

import org.example.repository.MovieRepository;
import org.example.model.Movie;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SQLiteMovieRepository implements MovieRepository {
    private final Connection connection;

    public SQLiteMovieRepository(Connection connection) {
        this.connection = connection;
        createTable();
    }

    private void createTable() {
        try (Statement stmt = connection.createStatement()) {
            stmt.execute("CREATE TABLE IF NOT EXISTS movies (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "title TEXT NOT NULL," +
                    "director TEXT," +
                    "year INTEGER," +
                    "genres TEXT," +
                    "tags TEXT)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Реализация методов интерфейса
}