   public class Household
   {   
      private String account;
      private int members;
   	private int [] arrWaterUse;
    
              
      public Household()
      {
          account = "";
          members = 0;   
          arrWaterUse =new int [7];
         
       
      }
   
      public Household(String Account, int Members, int[]arrWater)
      {
          account = Account;
          members = Members;
          arrWaterUse =arrWater;
                   
          
  		}
   
          
      public boolean determineHighRisk(double dayLimit)
      {
                
         return false;
      			 
      }
    
         
                    
      public String toString()
      {
         String objStr = "Account number: " + account  + "Number of members: " + members;
         return objStr;
      }//toStirng
        
        
   

public int CalculateTotal(){
  
    int tempTotal =0;
    
for(int i =0;i<7;i++){

tempTotal = tempTotal + arrWaterUse[i];
    
}
return tempTotal;
}//calctotal

public double CalculateAverage(){

double tempAvg = CalculateTotal() / 7.0;

return tempAvg;

}

public int HighestValue(){

    
    int highday = 1;
    int tempHigh = arrWaterUse[0];
    
    for(int i = 1; i<7;i++){

         if(arrWaterUse[i] == tempHigh){
         
             tempHigh = arrWaterUse[i];
             highday = i+1;
             
         
         }
         
         return  highday;
        
        
}
    
   
    
    
    return 0;
}

   }