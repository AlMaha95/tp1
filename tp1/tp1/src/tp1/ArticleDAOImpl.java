package tp1;

import java.sql.*;
import java.util.List;
import java.util.Vector;
public class ArticleDAOImpl {

	cnx connection = null;
	// M�thode de connexion
	protected Connection getConnected() {
	String url = "";
	//jdbc:mysql://localhost:3306/
	String user = "root";
	String passwd = "";
	try {
	Class.forName("");
	connection = DriverManager.getConnection(url, user,
	passwd);
	} catch (Exception e) {
	System.out.println(" Attention Exception : " + e);
	}
	return connection;
	}
	// Lib�ration Connection
	protected void releaseConnection() {
	try {
	connection.close();
	} catch (SQLException e) {
	System.out
	.println(" Attention Exception lors de la lib�ration de la connection : " + e);
	}
	}
}
