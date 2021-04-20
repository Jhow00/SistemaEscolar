/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Jhow
 */
public class DBConnection {
    /**
	 * @return conex�o com o banco.
	 */
	public static Connection getConnection() {
		try {
			// load the sqlite-JDBC driver using the current class loader
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		Connection connection = null;
		try {
			// create a database connection
			connection = DriverManager
					.getConnection("jdbc:sqlite:mydatabase.db");
			Statement statement = connection.createStatement();
			statement
					.executeUpdate("create table if not exists Aluno (Matricula string, Turma string)");
		} catch (SQLException e) {
			// if the error message is "out of memory",
			// it probably means no database file is found
			System.err.println(e.getMessage());
		}

		return connection;
	}
}
