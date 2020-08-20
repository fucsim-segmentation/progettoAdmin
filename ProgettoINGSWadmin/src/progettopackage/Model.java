/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettopackage;

/**
 *
 * @author Simone
 */
import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import progettopackage.Connection.ConnectionClass;
import java.util.Observable;


public class Model {
    
     private static String url = "jdbc:sqlserver://"+ConnectionClass.ip+"\\SQLEXPRESS:1433;databaseName="+ConnectionClass.db+"";
        //private static String url="jdbc:sqlserver://"+ConnectionClass.ip+":1433";
        private static Statement stmt = null;
        private static  ResultSet result = null;
        private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        private static String databaseUserName = "adminSal";
        private static String databasePassword = "SimSal1920";
        private static  Connection conn=null;
        
        Admin ad;
        Utente ut;
        
        public int checkAdmin (String username,String password){
            String query = "SELECT * FROM Admin1 WHERE username = ? AND passwd = ?";
            return 1;
        }

        /*private String url = "jdbc:sqlserver://"+ConnectionClass.ip+"\\SQLEXPRESS:1433;databaseName="+ConnectionClass.db+"";
        private Statement stmt = null;
        private ResultSet result = null;
        private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        private static String databaseUserName = "adminSal";
        private static String databasePassword = "SimSal1920";*/
        
        
        public static  Connection getConnection(){
           
         
       try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, databaseUserName, databasePassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
       }
       /* public static void main (String[]args){
            try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, databaseUserName, databasePassword);
            stmt = conn.createStatement();
            result = null;
            String nome,cognome;
            result = stmt.executeQuery("select * from Utente ");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
            System.out.println(result);
        }*/
        
        
        
       public void addInBlacklist (String nickname,String username,Date data){
           
       } 
       
       
       public void modifyLastLogin (Date data){
           
       }
       
       
       public void searchBlacklist (String nickname){
           
       }
}