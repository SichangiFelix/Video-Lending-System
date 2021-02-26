/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;

/**
 *
 * @author SICHANGI
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class Connector {
    
    public Connector(){
       try{ 
        //Get a connection
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/vlsdb","root","sangoro31");
        JOptionPane.showMessageDialog(null,"Connection to the database is successful");
        //create a statement
        Statement myStmt = mycon.createStatement();
        //execute SQL querry
       ResultSet myRs = myStmt.executeQuery("SELECT * FROM login;");
        //process the result set
        while (myRs.next()){
            String user = myRs.getString("Username");
            String pass = myRs.getString("Password");
        }
       }
       catch(Exception exc){
           JOptionPane.showMessageDialog(null,exc);
           //return null; 
       }
    }
    
    public static void main(String [] args){
        new Connector();
    }
}
