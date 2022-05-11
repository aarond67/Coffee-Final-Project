public class month
{
    /* barasita list for each day
     income total
     income per day
     most popular 
     */
     private String name;
     private double totalIncome = 0;
     private double incomePerDay = 0;
     private String mostpop;
     private barasitas[][] workers; 
     public month(String name, int days){
         this.name = name;
         workers = new barasitas[3][days];
     }
    
}
