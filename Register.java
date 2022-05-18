import java.util.ArrayList;
import java.util.Scanner;

public class Register 
{
    /*
     *list of drinks to choose from 
     plus price
     add name and thenhoose as many drink and delte and add 
     */
    private ArrayList <String> listOfDrinks;
    private ArrayList <Order> orders;
    private String[] listOfWorkers;
    public Register(String [] listOfWorkers1, ArrayList <String> listOfDrinks1){
        listOfWorkers = listOfWorkers1;
        orders = new ArrayList <Order>();
        listOfDrinks = listOfDrinks1;
    }
    public Order makeOrder(String name){
        Order newo = new Order(name, listOfDrinks);
        Scanner userinput = new Scanner(System.in);
        boolean orderInP= true;
        System.out.println("Please start the order");
        while(orderInP){
            String choice = userinput.nextLine();
            if(choice.equalsIgnoreCase("No") || choice.equalsIgnoreCase("Nope")){
                System.out.println(newo.showOrder());
                System.out.println("Is this correct?");
                choice = userinput.nextLine();
                if(choice.equalsIgnoreCase("Yep") || choice.equalsIgnoreCase("Yes")){
                    orderInP = false;
                }else if(choice.equalsIgnoreCase("No") || choice.equalsIgnoreCase("Nope")){
                    System.out.println("Then please add the new item or select the number of the item you want to delete");
                }
            }else{
                if(newo.addOrder(choice)){
                    System.out.println(newo.showOrder());
                    System.out.println("Anything else?");
                }else{
                  System.out.println("You did not enter the a item on our menu please try again");  
                }
            }
        }
        orders.add(newo);
        return newo;
    }
}
