import java.io.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class connectDB {
Connection conn;
  
public connectDB()
{
     try
         {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         }
             catch(ClassNotFoundException e)
            {
             JOptionPane.showMessageDialog(null,  "Unable to connect");
            }
      
         try
         {
            String filename = "FlightInfo.mdb";
            String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=";
            database += filename.trim () + ";DriverID=22;READONLY=true}"; 
            conn = DriverManager.getConnection (database, "", "");
            
            
         }
             catch(Exception e)
            {
          JOptionPane.showMessageDialog(null,e.getMessage());
            }
    }//end of constructor

        ResultSet queryTbl(String sqlStmt)throws SQLException
      {
         Statement stmt1 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
         ResultSet rs = stmt1.executeQuery(sqlStmt);
         return rs;
      }
   
       void updateTbl(String update)throws SQLException
      {
         Statement stmt1 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
         stmt1.executeUpdate(update);
         stmt1.close();
         
      }

    void updateTbl(ResultSet sql) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}