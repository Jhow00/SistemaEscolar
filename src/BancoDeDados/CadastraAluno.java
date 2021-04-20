/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sistema.escolar.Aluno;
/**
 *
 * @author Jhow
 */
public class CadastraAluno {
    public static void insertProduct(Aluno aluno) {
		Connection connection = DBConnection.getConnection();
		try {
			// ---- Criando o Comando ----//
			PreparedStatement comando = connection
					.prepareStatement("INSERT INTO PRODUTO VALUES (?, ?)");
			// ---- Definindo os par�metros ----//
			comando.setString(1, aluno.getMatricula());
			comando.setString(2, aluno.getTurmaAtual());
			// ---- Executando ----//
			comando.executeUpdate();
			// ---- Solicitando o Commit ----//
			comando.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			System.out.println("Erro na inser��o: " + sqle.getMessage());
		}
	}
}
