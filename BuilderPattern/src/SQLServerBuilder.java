
public class SQLServerBuilder implements DBBuilder{
	
	private DBConnection sqlserver;
	
	public SQLServerBuilder(){
		sqlserver= new DBConnection();
	}

	@Override
	public void buildUs() {
		sqlserver.setUs("root");
	}

	@Override
	public void buildPass() {
		sqlserver.setPass("builder");
	}

	@Override
	public void buildURL() {
		sqlserver.setURL("jdbc:microsoft:sqlserver://localhost:1433:databaseName=Persona");
	}
	
	public void buildDriver() {
		sqlserver.setDriver("com.microsoft.jdbc.sqlserver.SQLServerDriver");
	}
	
	@Override
	public void buildConnection(){
		sqlserver.connectDataBase();
	}

	@Override
	public DBConnection getDBConnection() {
		return sqlserver;
	}
	

}
