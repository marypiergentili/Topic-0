public class MySQLBuilder implements DBBuilder {
	
	private DBConnection mySQL;
	
	public MySQLBuilder(){
		mySQL = new DBConnection();
	}
	
	@Override
	public void buildUs() {
		mySQL.setUs("root");
	}

	@Override
	public void buildPass() {
		mySQL.setPass("builder");
	}

	@Override
	public void buildURL() {
		mySQL.setURL("jdbc:mysql://localhost:3306/Persona.sql");
	}
	
	@Override
	public void buildDriver() {
		mySQL.setDriver("com.mysql.jdbc.Driver");
	}
	
	@Override
	public void buildConnection(){
		mySQL.connectDataBase();
	}
	
	@Override
	public DBConnection getDBConnection() {
		return mySQL;
	}



}



