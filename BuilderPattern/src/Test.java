
public class Test {
	
	public static void main (String[] args){
		
		//creating the builder
		DBBuilder dbBuilder = new MySQLBuilder();
		//creating the director assigning the builder type
		ConnectionDirector director = new ConnectionDirector(dbBuilder);
		//setting the data base parameters
		director.constructDataBase();
		//getting the data base attributes
		DBConnection dbConnection = director.getDBConnection();
		//showing the attributes on the screen
		System.out.println("Trying to connect to "+dbConnection);
		//trying to establish the connection to the db (sends a massage if its not possible)
		director.connectDataBase();
		
		//doing the same process as earlier with the other data base
		dbBuilder= new SQLServerBuilder();
		director= new ConnectionDirector(dbBuilder);
		director.constructDataBase();
		dbConnection = director.getDBConnection();
		System.out.println("Trying to connect to "+dbConnection);
		director.connectDataBase();
				
		
	}

}
