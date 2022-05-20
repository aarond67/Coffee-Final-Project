import java.util.Scanner;
public class starter {
    public static void main(String[] args) {
        year workYear = new year("School Year");
        System.out.println("Hello and welcome!");
        boolean yearGoing = true;
        Scanner userinput = new Scanner(System.in);
        while(yearGoing){
            workYear.beginYear(userinput);
            System.out.println("If you want to finish the year type in 'Finish Year'");
            if(userinput.nextLine().equals("Finish Year")){
                yearGoing = false;
            }
        }
        
    }
}