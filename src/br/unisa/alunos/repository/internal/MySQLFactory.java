package br.unisa.alunos.repository.internal;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.MessageFormat;

import org.apache.commons.dbcp.BasicDataSource;

/**
 * @author zyon.silva
 * class para criar conexao com banco e entrega essa conexao para quem precisar
 */
public class MySQLFactory {

		
	private static String ip = "localhost:3306";
	
	private static String userName = "root";
	
	private static String password = "";
	
	private static BasicDataSource basicDataSource;
	private static Connection conn;

	private static final String CONNECTION_STRING = "jdbc:mysql://{0}/alunos";

	/**
	 * @return {@link Connection} 
	 */
	public static Connection getConection() {
		try {
			if (conn != null && !conn.isClosed()) {
				return conn;
			}
			basicDataSource = new BasicDataSource();
			basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
			basicDataSource.setUrl(getConnectionString());
			basicDataSource.setUsername(userName);
			basicDataSource.setPassword(password);
			conn = basicDataSource.getConnection();
			return conn;
		} catch (SQLException e) {
			return null;
		}
	}

	private static String getConnectionString() {
		return MessageFormat.format(CONNECTION_STRING, ip);
	}
}
