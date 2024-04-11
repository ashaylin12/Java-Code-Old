/*   A           sssssss       HH      HH      LL          IIIIIIIIIIIII   NNN        NN
    A A         ssss           HH      HH      LL               III        NN  N      NN  
   AA AA         sssss         HHHHHHHHHH      LL               III        NN    N    NN
  A     A           sssss      HHHHHHHHHH      LL               III        NN      N  NN            
 AAAAAAAAAA     sss    ssss    HH      HH      LL               III        NN       N NN
AA        AA      ssssss       HH      HH      LLLLLLLLLLL IIIIIIIIIIIII   NN         NN

 ASHAYLIN SEWNATH 11SA 
 * */

public class ClientInfoSewnathAS {

    private int ClientID;
    private String ClientName;
    private double HoursUsed;
    private int counter = 0;
    double cost = 0;


    public ClientInfoSewnathAS(int id, String cname, double hours) {
        
         ClientID = id;
         ClientName = cname;
         HoursUsed = hours;
         
    }
    
 
    @Override
    public String toString()  {
       
        String objStr = String.format("%-20s%-25s%-15s%-10sR%-10.2f%10sR%5.2f", "ClientID:"+ClientID, ClientName,  ("" + HoursUsed).replaceAll("\\.","H" )+"Mins", "Discount: ",CalculateDiscount(), "Cost: ",CalculateCost()-CalculateDiscount()) ;  
        
   
        return  objStr;
        
    }//toString
       
         

        public double CalculateCost(){
        
        String time = "" + HoursUsed;
       cost = 0.00;
        
        String [] temp1 = time.split("\\.");
        
         int hours = Integer.parseInt(temp1 [0]);
         int mins = Integer.parseInt(temp1 [1]);
        
         cost = (hours * 30);
       
         if(mins <=15 ){
         cost = cost + 10;
         }
        
         else if(mins>15 && mins <=30  ){
         cost = cost +18;
         }
        
        
        
         else if(mins>30 && mins <=45  ){
         cost = cost +25;
         }
        
         else if(mins>45 && mins <60  ){
         cost = cost +30;
         }
         
    
        
         return cost ;
        

    }//calcCost
        
         public double CalculateDiscount () {
             
                        
             double temp1Cost = CalculateCost() ;
                  
             double discount = 0.00;
             if(ClientID != 999){
       
          discount = temp1Cost * 0.05;
         
          
           
             }
                
         return discount ;

    }//discount
         
         public String getClientName(){
         
             return ClientName;
         }
         
         
         
         public int getClientID(){
         return ClientID;
         }
         
         
    
    
}
