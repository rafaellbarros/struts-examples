package br.com.developer.config.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	public static Connection getConnetion(int dbId) {
		return FactoryDB.create(dbId);
	}
}
