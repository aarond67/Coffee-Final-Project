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
     private Day[] days; 
     public month(String name, int days){
         this.name = name;
         days = new Day[days]
     }
     public boolean addDay(day d1){
        for(int i = 0; i < days.length; i++){
            if(days[i] == null){
                days[i] = d1;
                return true;
            }
        }
        return false;
    }
    public String popularDrink(){
        
    }
    
}
