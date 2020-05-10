package br.com.developer.config.db;

import java.sql.Connection;

public class FactoryDB {

    public static  Connection create(int dbId) {
        switch (dbId) {
            case 1:
                return MysqlDB.getConnetion();
            case 2:
                return PostgresDB.getConnetion();
            default:
                throw new RuntimeException("dbId não existe!");
        }
    }
}
