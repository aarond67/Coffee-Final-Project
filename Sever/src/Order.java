import java.util.ArrayList;
public class Order
{
    private ArrayList <String> list = new ArrayList <String>();
    /*private String name;*/
    private double price;
    private ArrayList <String> listOfDrinks;
    public Order(String name, ArrayList <String> listOfDrinks1){
        /*this.name = name;*/
        listOfDrinks = listOfDrinks1;
    }
    public boolean addOrder(String nameo){
        if(isOnList(nameo)){
            list.add(nameo); 
            return true;
        }
        return false;
    }
    public String showOrder(){
        return String.join(", ", list) + " Total: $" + price;
    }
    private boolean isOnList(String nameo){
        for(int i = 0; i < listOfDrinks.size(); i++){
            if(nameo.equals(listOfDrinks.get(i))){
                price += 2;
                return true; 
            }
        }
        return false;
    }
}
