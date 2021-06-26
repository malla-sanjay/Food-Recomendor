import java.util.Random;
import java.util.Scanner;

public class FoodRecomend
{
    //creating an array
    private static String foodArray[] = new String[7] ;
    
    public static void main(String[] args)
    {
       // entries in the array 
       foodArray[0] = "Mo:Mo";
       foodArray[1] = "Sekuwa";
       foodArray[2] = "Biriyani";
       foodArray[3] = "Buff-Sukuti";
       foodArray[4] = "Naan";
       foodArray[5] = "Burger";
       foodArray[6] = "Fried Chicken";
       
       //creating a Random class object
       Random random = new Random();
       
       //initial randomizing and storing food items on options
       String firstOpt = foodArray[random.nextInt(7)];
       String secondOpt = foodArray[random.nextInt(7)];
       
       //while loop to make sure that the options randomize until they are not same
       while(firstOpt == secondOpt){
           firstOpt = foodArray[random.nextInt(7)];
       }
       
       //some what a UI to interact with user
       Scanner scan = new Scanner(System.in);
       System.out.println("Confused on what to eat today!?");
       System.out.println("Try eating " + firstOpt);
       System.out.println("Are you satisfied with this option? you can switch if you want");
       
       //for user to have second option if they dont fancy the first
       System.out.println("Enter N for another recomendation or Press any key and enjoy your meal");
       char decision = scan.next().charAt(0);
       
       //if else to process if the user wants next option or to exit
       if (decision == 'n' || decision == 'N') {
           System.out.println("Alright, try " + secondOpt + " instead");
        }
       else {
           System.out.println("Alright, Enjoy your " + firstOpt + " user");
       } 
    } 
}
