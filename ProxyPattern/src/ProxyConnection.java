
public class ProxyConnection implements SQLConnection {

	private RealConnection realConnection= null;
	private String us = "root";
	private String pass = "proxypattern";
	
	//constructor only generates a new instance of RealConnection if there isn't one.
	public ProxyConnection (){
		if (realConnection == null){
			realConnection = new RealConnection();
		}
	}
	
	//connecting to the data base, if the password and user are correct
	public void Connect (String us, String pass){
		if ( us.equals(us) && pass.equals(pass)){
			realConnection.Connect(this.us, this.pass);
		}
		else
			System.out.println("Connection has failed, incorrect user or password.");
	}
}
