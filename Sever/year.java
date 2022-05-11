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
    private month[] months = new month[12];
    private String mostpop;
    private String leastpop;
    private int amountOfDrinks;
    public year(){
        
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
        for(int i )
    ]
}
