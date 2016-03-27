/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum;




import java.sql.*;



/**
 *
 * @author Sachin
 */
public class javaconnect {
    
    public static void main(String args[])
	{
		
		
		
		try
		{
			java.sql.Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/forum","root","");
			java.sql.Statement mystat = mycon.createStatement();
			ResultSet myresult = mystat.executeQuery("select * from user");
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
    
}
