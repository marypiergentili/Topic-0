import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	//attributes
	private String us;
	private String pass;
	private Connection connection= null;
	private String url;
	private String driver;
	
	public DBConnection(){
		connection= null;
	}
	
	//setters
	public void setUs(String us){
		this.us=us;
	}
	public void setPass(String pass){
		this.pass=pass;
	}
	public void setURL(String url){
		this.url=url;
	}
	public void setDriver(String driver){
		this.driver=driver;
	}

	
	//getters
	public String getUs(){
		return us;
	}
	public String getPass(){
		return pass;
	}
	public String getURL()
	{
		return url;
	}
	public String getDriver(){
		return driver;
	}
	public Connection getConnection(){
		return connection;
	}
	
	//toString
	public String toString (){
		return "URL: " +url+ "\nUser: "+us+"\nPassword: "+pass+"\nDriver: "+driver;
	}
	
	//connecting to the data base
	public void connectDataBase(){
		if (connection == null){
			try{
				Class.forName(driver);
				connection = (Connection)DriverManager.getConnection(url, us, pass);
				System.out.println("Connected to "+url+" data base.");
			}
			catch (SQLException e){
				System.out.println("Connection to the "+url+" has failed");
			}
			catch (ClassNotFoundException e){
				System.out.println("Connection to the "+url+" has failed");
			}
		}
		else
			System.out.println("Connection is not null");
	}
	

}
