public class ConnectionDirector {
	
	private DBBuilder builder = null;
	
	//constructor
	public ConnectionDirector(DBBuilder builder){
		this.builder=builder;
	}
	
	//build the data base attributes
	public void constructDataBase(){
		builder.buildUs();
		builder.buildPass();
		builder.buildURL();
		builder.buildDriver();
	}
	
	//building the connection to the data base, after setting all the attributes to do it
	public void connectDataBase(){
		builder.buildConnection();
	}
	
	// getter
	public DBConnection getDBConnection(){
		return builder.getDBConnection();
	}

}