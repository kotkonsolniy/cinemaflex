package org.example.implementation;

import org.example.repository.UserRepository;
import org.example.model.User;
import java.sql.*;

public class SQLiteUserRepository implements UserRepository {
    private final Connection connection;

    public SQLiteUserRepository(Connection connection) {
        this.connection = connection;
        createTable();
    }

    private void createTable() {
        try (Statement stmt = connection.createStatement()) {
            stmt.execute("CREATE TABLE IF NOT EXISTS users (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "name TEXT NOT NULL," +
                    "email TEXT UNIQUE NOT NULL)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Реализация методов интерфейса
}