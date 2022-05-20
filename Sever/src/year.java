import java.text.DateFormatSymbols;

import java.util.Scanner;
public class year
{
    /*total incom
    income per month
    most poular
    least pop
    amounts of drinks sold 
    month where that specific drink was the most selling
    */
    
    private month[] months = new month[9];
    /*private String mostpop = "s";
    private String leastpop;
    private double totalIncome = 0.0 ;
    private int amountOfDrinks;
    */
    String[] months1 = new DateFormatSymbols().getMonths();
    public year(String year){
        if(year.equalsIgnoreCase("School Year")){
            months = new month[9];
            for(int i = 0; i < 9; i++){
                if(i <= 4){
                    months[i] = new month(months1[i+7], 30);
                }else{
                    months[i] = new month(months1[i-5], 30);
                }
                
            }
        }
    }
    public void beginYear(Scanner userinput){
        System.out.println("Please select the month you want to start in with. \nWhen you are done for today please type in 'Shut Down' and it will end");
        print(); 
        String input = userinput.nextLine();
        for(int i = 0; i < months.length; i++){
            if(input.equalsIgnoreCase(months[i].getName())|| input.equals("" + (i+1))){
                month usermonth = months[i];
                System.out.println("Alright I see you have choose " + usermonth.getName() + ". \nNow please select the day you want to choose to start working");
                int dateInput = userinput.nextInt();
                System.out.println("Alright you have choosen to work the " + dateInput + ". \nNow choose the shift that you are working today. Morning or Lunch");
                boolean working = true;
                while(working){
                    String shiftInput = userinput.nextLine(); 
                    if(shiftInput.equalsIgnoreCase("Morning")||shiftInput.equalsIgnoreCase("Lunch")){
                        usermonth.beginDay(dateInput, shiftInput, userinput);
                        working = false;
                    }
                }
                i = months.length;
            }
        }
        
    }
    private void print(){
        for(int i = 0; i < 9; i++){
            System.out.println("[" + (i+1) + "] " + months[i].getName());
        }
    }
    
}