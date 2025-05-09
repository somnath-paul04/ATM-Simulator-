package bank.management.system;

import java.sql.*;

public class Conn {
	
	Connection c;
	Statement s;
	Conn(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql:///bankmanagementsystem";
			String user="root";
			String password="Somnath@04";
			
			c=DriverManager.getConnection(url,user,password);
			s=c.createStatement();			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	

}
