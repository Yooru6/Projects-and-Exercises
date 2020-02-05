package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnector {
		
	private static DBConnector jdbc;
	
	public DBConnector() {};
	
	public static DBConnector getInstance() {
		if (jdbc==null) {
			jdbc=new DBConnector();
		}
		return jdbc;
		
	}

   /**Connection Method for sql queries**/
	private static Connection getConnection() throws ClassNotFoundException, SQLException {
	    String userName = "username";
		String password = "password";
		String url="jdbc:mariadb:/url/";
		String driver = "org.mariadb.jdbc.Driver";
		String database = "dbname";
		
		
		Connection con=null;
		Class.forName(driver);
		con=DriverManager.getConnection(url+database,userName,password);
		
		System.out.println("Connected to "+url+database);
		return con;
		
		
	}
	
	
    public void addUser(String username, String fname, String lname, String email, String passwordi,String type) {
    	PreparedStatement prepSt=null;
    	ResultSet rs=null;
    	Statement st=null;
    	Connection con=null;
    	
       	try {
			
        	
        	con=DBConnector.getConnection(); //this.getConnection
			st = con.createStatement();			 
			
			//Checking if username is already in use
	         String sql = "SELECT * FROM users WHERE user_username='"+username+"'";
	         rs = st.executeQuery(sql);
	         
	         
	         //If username is not in use insert information to the table:
	         if (!rs.next()) {//returns false no rows
	        	 try {
	        	 
                 prepSt=con.prepareStatement("INSERT INTO users (user_username,user_firstname,user_lastname,user_password,user_email,user_type) VALUES(?,?,?,?,?,?)");
	        	 prepSt.setString(1, username);
	        	 prepSt.setString(2, fname);
	        	 prepSt.setString(3, lname);
	        	 prepSt.setString(4, passwordi);
	        	 prepSt.setString(5, email);
	        	 prepSt.setString(6, type);
	        	 
	        	 prepSt.executeUpdate();
	        	 System.out.println("USER ADDED TO DATABASE...");
	        	 }catch (SQLException se) {
	        		 System.out.println("INSERT USER ERROR");
	        		 se.printStackTrace();
	        	 }
                 
	        //If username is already in use
	         	}else {
	        	 System.out.println("USERNAME IS ALREADY IN USE CHOOSE ANOTHER ONE...");
	         }
	         
			
		} catch (Exception e) {
			System.out.println("ADDUSER ERROR");
			e.printStackTrace();
		}finally {
		    try { rs.close(); } catch (Exception e) { /* ignored */ }
		    try { st.close(); } catch (Exception e) { /* ignored */ }
		    try { prepSt.close(); } catch (Exception e) { /* ignored */ }
		    try { con.close(); } catch (Exception e) { /* ignored */ }
		    System.out.println("Connection Closed");
		}          	        	
        
    	 
     }
    
    
    public void viewUser(String username){
    	PreparedStatement prepSt=null;
    	ResultSet rs=null;
    	Statement st=null;
    	Connection con=null;
    	
       	try {
			
        	
        	con=this.getConnection();
			st = con.createStatement();			 
			
			//Checking if username is already in use
	         String sql = "SELECT * FROM users WHERE user_username=?";
	         
	         
	         //prepSt=con.prepareStatement("SELECT * FROM users WHERE user_username LIKE ?");
             prepSt=con.prepareStatement("SELECT * FROM users WHERE user_username=?");
             prepSt.setString(1, username);	//"%" + parameter + "%"
             rs = prepSt.executeQuery();
        	          
        	 while (rs.next()) {  
                 System.out.println("Name = "+rs.getString(2)+"\n"+"Lastname= "+rs.getString(3)+"\n"+"email= "+rs.getString(6));
                       
        	 }  
	         
			
		} catch (Exception e) {
			System.out.println("VIEW ERROR");
			e.printStackTrace();
		}finally {
		    try { rs.close(); } catch (Exception e) { /* ignored */ }
		    try { st.close(); } catch (Exception e) { /* ignored */ }
		    try { prepSt.close(); } catch (Exception e) { /* ignored */ }
		    try { con.close(); } catch (Exception e) { /* ignored */ }
		    System.out.println("Connection Closed");
		}          	        	
        
    	 
     }
	
	
	
	}

