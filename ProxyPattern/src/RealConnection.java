import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RealConnection implements SQLConnection {
	
	private String database= "Persona.sql";
	private String url= "jdbc:mysql://localhost:3306/"+database;
	private Connection connection = null;
	
	//connecting to the database
	public void Connect (String us, String pass){
		if (connection == null){
			try{
				Class.forName("com.mysql.jdbc.Driver");
				connection= (Connection)DriverManager.getConnection(url, us, pass);
				System.out.println("Conneted to MySQL database "+url);
			}
			catch (SQLException e){
				e.printStackTrace();
			}
			catch (ClassNotFoundException e){
				e.printStackTrace();
			}
		}
		else 
			System.out.println("The connection to the "+url+" is running");
	}

}
