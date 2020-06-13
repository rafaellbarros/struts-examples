package br.com.developer.test;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.developer.config.db.ConnectionDB;

public class TestConnectionDB {

	public static void main(String[] args) {
		try {
			int mysqlId = 1;
			Connection conn = ConnectionDB.getConnetion(mysqlId);
			System.out.println("Abrindo conexão com Banco!");
			conn.close();
			System.out.println("Fechando conexão com Banco!");
		} catch (SQLException e) {
			throw new RuntimeException("Não foi possivel fazer conexaão com Banco! Message:" + e.getMessage());
		}
	}
	
}
