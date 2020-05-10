package br.com.developer.config.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresDB {

    private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
    private static final String DB_USER_POSTGRES = "postgres";
    private static final String DB_PASSWORD = "root";
    private static final String DB_DATABASE_POSTGRES = "postgres";
    private static final String DB_URLPOSTGRES_JDBC = "jdbc:postgresql://127.0.0.1:54320";
    private static final String ERROR_DRIVER = "O driver não foi carregado!";

    public static Connection getConnetion() {
        Connection con = null;
        try {
            Class.forName(POSTGRES_DRIVER);
            con = DriverManager.getConnection(DB_URLPOSTGRES_JDBC.concat("/").concat(DB_DATABASE_POSTGRES),DB_USER_POSTGRES,DB_PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(ERROR_DRIVER);
        }
        return con;
    }
}
