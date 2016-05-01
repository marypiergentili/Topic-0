
public interface DBBuilder {
	
	void buildUs ();
	void buildPass();
	void buildURL();
	void buildDriver();
	void buildConnection();
	DBConnection getDBConnection();

}
