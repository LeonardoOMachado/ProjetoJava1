package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection connection = null;
	
	public static Connection getConnection() {		
	        
		if ( connection == null ) {
	        try {
	            /* Obt�m o driver de conex�o com o banco de dados */
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            /* Configura os par�metros da conex�o */
	            String url = "jdbc:mysql://localhost:3306/projetoweb1db?useTimezone=true&serverTimezone=UTC";	            
	            /* Tenta se conectar */
	            String usuario = "root";
	            String senha = "merda123";
	            connection = DriverManager.getConnection(url, usuario, senha);
	            /* Caso a conex�o ocorra com sucesso, a conex�o � retornada */
	            System.out.println("Conectado com sucesso");
	            return connection;
	        } catch (ClassNotFoundException e) {            
	            System.out.println("O driver expecificado nao foi encontrado.");
	            return null;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return null;
	        }
		}
		return connection;
	        
	}
	
}
