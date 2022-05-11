import java.util.ArrayList;
public class Day
{
    /*barasta term for the day
     income for the day
     date
      orders with list of drinks and prices
      orders made and then recursion to find the specific persona then order sort
     */
    private int totIncome;
    private ArrayList <Order> orders;
    private String[] moringShift = new String[3];
    private String[] lunchShift = new String[3];
    public Day(String barista1, String barista2, String register1, String baraista3, String baraista4, String register2){
        moringShift[0] = register1;
        moringShift[1] = barista1;
        moringShift[2] = barista2;
        lunchShift[0] = register1;
        lunchShift[1] = barista1;
        lunchShift[2] = barista2;
        orders = new <Order>;
    }
}
