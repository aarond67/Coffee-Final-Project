<<<<<<< HEAD
public class year{
    public year(){

    }
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
    public int claculator(int i){
        return i+1;
    }
}
=======
public class year
{
    /*total incom
    income per month
    most poular
    least pop
    amounts of drinks sold 
    month where that specific drink was the most selling
    */
    private double totalIncome = 0;
    private month[] months;
    private String mostpop;
    private String leastpop;
    private int amountOfDrinks;
    public year(int schoolyear){
        months = new month[schoolyear];
    }
    public boolean addMonth(month m1){
        for(int i = 0; i < months.length; i++){
            if(months[i] == null){
                months[i] = m1;
                return true;
            }
        }
        return false;
    }
    public String popularDrink()[
        
    ]
}
>>>>>>> 20fa543fefa18f9e79b4aae2e121d1d483c10667
