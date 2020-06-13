package br.com.developer.config.db;

import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Log4j2
public class MysqlDB {

    private static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";
    private static final String DB_DATABASE = "cadastro_cliente";
    private static final String DB_URL_JDBC = "jdbc:mysql://localhost:33260"+"/"+ DB_DATABASE;
    private static final String ERROR_DRIVER = "O driver não foi carregado!";

    public static Connection getConnetion() {

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
