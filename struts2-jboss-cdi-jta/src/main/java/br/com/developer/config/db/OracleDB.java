package br.com.developer.config.db;

import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Log4j2
public class OracleDB {

    private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_USER = "sys as sysdba";
    private static final String DB_PASSWORD = "TvX718DE/FU=1";
    private static final String DB_DATABASE = "xedb";
    private static final String DB_URL_JDBC = "jdbc:oracle:thin:@localhost:1521:xedb";

    public static Connection getConnetion()  {

        try (Connection conn = DriverManager.getConnection(DB_URL_JDBC, DB_USER, DB_PASSWORD)) {

            // Class.forName(DB_DRIVER);
            if (conn != null) {
                System.out.println("Conectado ao banco de dados!");
                return conn;
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            log.error(e.getMessage(), e);
        }
        return null;
    }
}
