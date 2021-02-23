/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author SICHANGI
 */
import java.sql.*;

public class Database {
    
    public Database(){
       try{ 
        //Get a connection
        //Class.forName("com.mysql.jdbc.Driver");  
        Connection mycon = DriverManager.getConnection("jdbc:mysql:localhost:3306/vlsdb","root","sangoro31");
        //create a statement
        Statement myStmt = mycon.createStatement();
        //execute SQL querry
        ResultSet myRs = myStmt.executeQuery("select * from members");
        //process the result set
        while (myRs.next()){
            System.out.println(myRs.getString("fname")+ "," + myRs.getString("sname"));
        }
       }
       catch(Exeption exc){
           exc.printStacktrace(); 
       }
    }
    
    public static void main(String [] args){
        new Database();
    }
}
