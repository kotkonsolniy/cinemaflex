package org.example;

import org.example.implementation.SQLiteMovieRepository;
import org.example.implementation.SQLiteRatingRepository;
import org.example.implementation.SQLiteUserRepository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CinemaFlixApplication {
    public static void main(String[] args) {
        try {
            // Подключение к SQLite
            Connection connection = DriverManager.getConnection("jdbc:sqlite:cinemaflex.db");

            // Инициализация репозиториев
            SQLiteUserRepository userRepository = new SQLiteUserRepository(connection);
            SQLiteMovieRepository movieRepository = new SQLiteMovieRepository(connection);
            SQLiteRatingRepository ratingRepository = new SQLiteRatingRepository(connection);

            // Здесь можно добавить логику приложения

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}