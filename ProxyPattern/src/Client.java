import java.util.Scanner;

public class Client {
	
	public static void main (String [] args){
				
		//creating the proxy
		ProxyConnection proxy=new ProxyConnection();
		
		//asking the user for user and password to access
		System.out.println("Connecting to the database");
		System.out.println("Plase insert user: ");
		//calling to the scanner class to import text form the keyboard
		Scanner keyboard = new Scanner(System.in);
		String user = keyboard.nextLine();
		System.out.println("Please insert password: ");
		String password = keyboard.nextLine();
		//closing the scanner connection
		keyboard.close();

		//connecting to the database
		proxy.Connect(user, password);
		
	}

}
