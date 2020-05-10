package br.com.developer.config.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlDB {

    private static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";
    private static final String DB_DATABASE = "struts2_crud_jquery";
    private static final String DB_URL_JDBC = "jdbc:mysql://172.18.0.1:3326";
    private static final String ERROR_DRIVER = "O driver não foi carregado!";

    public static Connection getConnetion() {
        Connection con = null;
        try {
            Class.forName(MYSQL_DRIVER);
            con = DriverManager.getConnection(DB_URL_JDBC.concat("/").concat(DB_DATABASE),DB_USER,DB_PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(ERROR_DRIVER);
        }
        return con;
    }

}
