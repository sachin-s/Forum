/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum;




import java.sql.*;
import javax.swing.JOptionPane;



/**
 *
 * @author Sachin
 */
public class javaconnect {
   
    
   public static Connection connectDb()
   {
       
		try
		{
			java.sql.Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/forum","root","");
                       
                       
                      return mycon;
                       
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
                
   
   }
    
}
