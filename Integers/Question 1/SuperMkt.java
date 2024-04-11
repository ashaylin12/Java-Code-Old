   import java.sql.*;
   import java.io.*;
   import javax.swing.JOptionPane;
   
    public class SuperMkt
   {
      Connection conn;
             
       public SuperMkt ()
      {
      //load the driver
         try
         {
            Class.forName ("sun.jdbc.odbc.JdbcOdbcDriver");
            System.out.println ("Driver successfully loaded");
         }
             catch (ClassNotFoundException c)
            {
               System.out.println ("Unable to load database driver");
            }      
      
      	 //connect to the database
         try
         {
         
            //conn = DriverManager.getConnection ("jdbc:odbc:BandB.mdb");
            
            //System.out.print("Type in the exact location of your database (FOR EXAMPLE - C:/TEST/Diseases.mdb)");   
            //BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
            //String filename = inKb.readLine();
            
            String filename = "CashRite.mdb";
          
            String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=";
            database += filename.trim () + ";DriverID=22;READONLY=true}"; 
            conn = DriverManager.getConnection (database, "", "");
         
            System.out.println ("Connection to database successfully established");
         
         }
             catch (Exception e)
            {
               System.out.println ("Unable to connect to the database");
            }
         
      } //end connect
    
       public void all (String sql) throws SQLException
      {
         System.out.println();
         Statement stmt = conn.createStatement (); 
        
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-10s%-38s%-10s","StockID","Item Name","Price");  
         System.out.println();
         System.out.println("=======================================================");  
         
         while (rs.next ())
         {
            String sId = rs.getString ("StockID");
            String sName = rs.getString ("ItemName");
            double sPrice = rs.getDouble ("UnitCostPrice");
            System.out.printf("%-10s%-38s%-10.2f",sId ,sName,sPrice);
            System.out.println();        
         }
          
         System.out.println(" ");
         rs.close();  
         stmt.close ();
      } 
   
       public void stockQty (String sql)throws SQLException
      {
         Statement stmt = conn.createStatement (); 
         
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-38s%-25s%-15s","Item Name","Department","Quantity");  
         System.out.println();
         System.out.println("================================================================");  
         while (rs.next ())
         {
            String sId = rs.getString ("ItemName");
            String sName = rs.getString ("Department");
            int sQty = rs.getInt ("NumberInStock");
                               
          
            System.out.printf("%-38s%-25s%-15d",sId ,sName,sQty);
            System.out.println();        
         } 
         System.out.println(" "); 
         rs.close(); 
         stmt.close ();
      } 
       public void reOrder (String sql)throws SQLException
      {
         Statement stmt = conn.createStatement (); 
         
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-20s%-38s%-15s","Bar Code","Item Name","ShortFall");  
         System.out.println();
         System.out.println("================================================================");  
         while (rs.next ())
         {
            String sBC = rs.getString ("BarCodeNum");
            String sName = rs.getString ("ItemName");
            int sFall = Integer.parseInt(rs.getString ("StockShortFall"));
                               
          
            System.out.printf("%-20s%-38s%-15d",sBC ,sName,sFall);
            System.out.println();        
         } 
         System.out.println(" "); 
         rs.close(); 
         stmt.close ();
      } 
      
       public void deptQry (String sql)throws SQLException
      {
         Statement stmt = conn.createStatement (); 
         
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-30s%-15s%-15s","Department","Average Cost"," No of Items");  
         System.out.println();
         System.out.println("================================================================");  
         while (rs.next ())
         {
            String sDpt = rs.getString ("Department");
            double avg =  Double.parseDouble(rs.getString ("AverageCost"));
            int sQty = Integer.parseInt(rs.getString ("NoItems"));
            //String sDpt = rs.getString ("Department");
                               
          
            System.out.printf("%-30s%-15.2f%-15d",sDpt,avg,sQty);
            System.out.println();        
         } 
         System.out.println(" "); 
         rs.close(); 
         stmt.close ();
      } 
       public void past5Qry (String sql)throws SQLException
      {
         Statement stmt = conn.createStatement (); 
         
         ResultSet rs = stmt.executeQuery (sql);
         System.out.println("The following items were ordered in the last 5 months");
         System.out.printf("%-10s%-35s%-20s%-15s","Stock ID","Item Name","Department","Date of Order");  
         System.out.println();
         System.out.println("================================================================");  
         while (rs.next ())
         {
            String stkID = rs.getString("StockID");
            String itemName = rs.getString("ItemName");
            String sDpt = rs.getString ("Department");
            String date = rs.getString("DateOfLastOrder");
            date = date.substring(0,10);
               //String sDpt = rs.getString ("Department");
                               
          
            System.out.printf("%-10s%-35s%-20s%-15s",stkID,itemName,sDpt,date);
            System.out.println();        
         } 
         System.out.println(" "); 
         rs.close(); 
         stmt.close ();
      } 
   
   
       public void adjustPrice (String sql)throws SQLException
      {
         System.out.println();
         Statement stmt = conn.createStatement (); 
      
         int rows = stmt.executeUpdate (sql);
         
         System.out.println(rows + " records updated");
          
         stmt.close ();
      } 
        
                               	
       public void supplierDetail(String sql)throws SQLException
      {
         System.out.println();
         Statement stmt = conn.createStatement (); 
      
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-8s%-37s%-20s%-15s","Stock ID","Item Name", "Supplier Name", "Contact Number"); 
         System.out.println();
         System.out.println("===============================================================================");  
         while (rs.next ())
         {
           
            String sId = rs.getString ("StockID");
            String sName = rs.getString ("ItemName");
            String suppN = rs.getString ("SupplierName");
            String sTel = rs.getString("SupplierTele");
            //int Weight = (int)Math.round(dWeight);
           
            //String sWeighDate = rs.getString("WeighDate");
            //sWeighDate = sWeighDate.substring(0,10);
          
            System.out.printf("%-8s%-37s%-20s%-15s",sId,sName, suppN, sTel);
            System.out.println();        
         } 
         System.out.println(" ");  
         stmt.close ();
      }
          
       public void disconnect () throws SQLException
      {
      
         conn.close ();
      }
   
   }
       
  
