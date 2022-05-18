import java.util.ArrayList;
public class month
{
    /* barasita list for each day
     income total
     income per day
     most popular 
     */
     private String name;
    /* private double totalIncome = 0;
     private double incomePerDay = 0;
     private String mostpop;
     */
     private Day[] days; 
     private ArrayList <String> listOfDrinks = new ArrayList<String> ();
     public month(String name, int numDay){
        this.name = name;
        days = new Day[numDay];
        listOfDrinks.add("Mocha");
        listOfDrinks.add("Black");
        listOfDrinks.add("Latte");
        listOfDrinks.add("Cap");
        for(int i = 0; i < days.length;i++){
             Day newo = new Day(listOfDrinks);
             days[i] = newo;
         }
    }
    public month(String name, int numDay, ArrayList <String> newlistOfDrinks){
         this.name = name;
         days = new Day[numDay];
         listOfDrinks = newlistOfDrinks;
        for(int i = 0; i < days.length;i++){
             Day newo = new Day(listOfDrinks);
             days[i] = newo;
         }
    }
    public Day beginDay(int num,String shift){
        if(shift.equals("Morning")){
            days[num-1].startDay(shift);
            return days[num-1];
        }
        System.out.println("WORNG");
        
        return days[num-1];
    }
    public String getName(){
        return name;
    }
    
    
    
}