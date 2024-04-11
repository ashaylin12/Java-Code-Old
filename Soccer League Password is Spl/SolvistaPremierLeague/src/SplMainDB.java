
import java.io.*;
import java.sql.*;
public class SplMainDB {
Connection conn;
   
       SplMainDB()
      {
         try
         {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            System.out.println("Driver Successfully Loaded");
         }
             catch(ClassNotFoundException e)
            {
               System.out.println("Unable to connect");
            }
      
         try
         {
         
            String filename = "C:/Documents and Settings/Bradley/Desktop/pronet/SolvistaPremierLeague/MySoccer";
            String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=";
            database += filename.trim () + ";DriverID=22;READONLY=true}"; 
            conn = DriverManager.getConnection (database, "", "");
            System.out.println ("Connection to Solvista Premier League database successfully established");

         }
             catch(Exception e)
            {
               System.out.println(e.getMessage());
            }
      }
   
       ResultSet queryTbl(String sqlStmt)throws SQLException
      {
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sqlStmt);
         return rs;
      }
   
       void updateTbl(String update)throws SQLException
      {
         Statement stmt = conn.createStatement();
         stmt.executeUpdate(update);
         stmt.close();
         
      }
        
}
