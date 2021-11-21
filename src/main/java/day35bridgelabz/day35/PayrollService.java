package day35bridgelabz.day35;

import java.sql.*;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class PayrollService {

	public static void main(String[] args) {
	String jdbcURL = "jdbc:mysql://localhost:3306/payrollServiceJDBC?useSSL=false";
	String userName="kumarB";
	String password= "root";
	Connection connection;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded !");
	}catch (ClassNotFoundException e) {
		throw new IllegalStateException("Can't find Driver in classpath",e);	
	}
	
    listDrivers();
    
    try {
    	System.out.println("Connecting to DB :"+jdbcURL);
    	connection =DriverManager.getConnection(jdbcURL,userName,password);
    	System.out.println("Connection is Successful !"+connection);
    }catch(Exception e) {
    	e.printStackTrace();
    }
 }

	private static void listDrivers() {
		Enumeration<Driver> driverList =DriverManager.getDrivers();
		while (driverList.hasMoreElements()) {
			Driver driverClass = (Driver) driverList.nextElement();
			System.out.println(" "+driverClass.getClass().getName());
		}
	}
}