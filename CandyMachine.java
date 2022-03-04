package CandyMachine;
import java.util.Scanner;

public class CandyMachine{
    static Scanner keyboard = new Scanner(System.in);

    //Method to Display item Choices
    public static Double displayChoices(){
        double price =-1;
        System.out.println("WELL HERE's WHAT I HAVE");
        System.out.println("A    $1.00     CANDIES");
        System.out.println("B    $5.00        CHIPS");
        System.out.println("C    $1.00      GUM");
        System.out.println("D    $7.00    COOKIES");

        System.out.println();
        System.out.print("Which Item would you Purchase (Letter?:");
        String choice = keyboard.next().toUpperCase();

        if(choice.equals("A")){
            price =1.00;
            return 1.00;
        }
        else if(choice.equals("B")){
            price =5.00;
            return 5.00;
        }
        if(choice.equals("C")){
            price =1.00;
            return 1.00;
        }
        else if(choice.equals("D")){
            price =7.00;
            return 7.00;
        }
        else{
         return price;
        }
    }

    //Method to Dispense Item and Return Changes
    public static void dispense(double moneyInserted,double candyCost ){
        if(moneyInserted > candyCost){
            System.out.println("Vending....");
            System.out.println("Here's your Candy!!!");
            double change = (double) moneyInserted - (double) candyCost;
            System.out.println("Here's your $" + change + "in change.");
            System.out.println("Please come back soon!!");
        }
        else{
            System.out.println("Sorry,your balance is not enough.Here's your $" + moneyInserted +"back. THANK YOU.");
        }
    }

    public static void main(String[] args){
        //Welcome Statement to CandyMachine
        System.out.println("Welcome to CandyMachine!!!");
        System.out.println("We got the Sweetest Candy in Town :)");

        //Prompt & Store for User Information
        System.out.print("How much money do you have?:");
        double moneyInserted = keyboard.nextDouble();

        //return type of the method was double, so have to store it
        double candyCost = displayChoices();

        //return type was void so don't have to shore it
        dispense(moneyInserted, candyCost);

    }
    
} 
