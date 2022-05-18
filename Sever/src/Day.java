import java.util.ArrayList;
import java.util.Scanner;
public class Day
{
    /*barasta term for the day
     income for the day
     date
      orders with list of drinks and prices
      orders made and then recursion to find the specific persona then order sort
     */
   /* private int totIncome;*/
    private ArrayList <Order> orders;
    private String[] moringShift = new String[3];
    private String[] lunchShift = new String[3];
    private ArrayList <String> listOfDrinks = new ArrayList <String>();
    public Day(ArrayList <String> newlistOfDrinks){
        moringShift[0] = "Caroline";
        moringShift[1] = "Aaron";
        moringShift[2] = "Gavin";
        lunchShift[0] = "Evan";
        lunchShift[1] = "Aaron M";
        lunchShift[2] = "Brain";
        listOfDrinks = newlistOfDrinks;
        orders = new ArrayList <Order>();
    }
    public Day(String barista1, String barista2, String register1, String baraista3, String baraista4, String register2,ArrayList <String> newlistOfDrinks){
        moringShift[0] = register1;
        moringShift[1] = barista1;
        moringShift[2] = barista2;
        lunchShift[0] = register1;
        lunchShift[1] = barista1;
        lunchShift[2] = barista2;
        listOfDrinks = newlistOfDrinks;
        orders = new ArrayList <Order>();
    }
    public boolean startDay(String shift){
        Register working = makeARegister(shift);
        Scanner userinput = new Scanner(System.in);
        boolean dayIsGoing = true;
        while(dayIsGoing){
            System.out.println("Ask the person for their name then their order will start. When you are done with the day type 'Finish Day'.");
            while(userinput.hasNextLine()){
                String input = userinput.nextLine();
                if(input.equals("Finish Day")){
                    dayIsGoing = false;
                }else{
                    orders.add(working.makeOrder(input));
                    break;
                }
            }
            if (!(userinput.hasNextLine())) {
                dayIsGoing = false;
            }
        }
        userinput.close();
        return dayIsGoing;
    }
    private Register makeARegister(String shift){
        if(shift.equals("Morning")){
           Register morning = new Register(moringShift,listOfDrinks); 
            return morning;
        }else{
            Register lunch = new Register(lunchShift,listOfDrinks);
            return lunch;
        }
    }
}