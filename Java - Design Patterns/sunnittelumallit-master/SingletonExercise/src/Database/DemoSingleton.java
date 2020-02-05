package Database;

public class DemoSingleton {
	public static void main(String[] args) {
		DBConnector database = DBConnector.getInstance();
		
		database.addUser("Singleton", "Single", "Single", "Single@Singleland.fi", "s1ngl3", "Single");

		database.viewUser("Singleton");

	}

}
