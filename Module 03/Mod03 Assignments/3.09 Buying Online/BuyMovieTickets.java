/**
 * Reciept maker for fictional online electronics store
 *
 * @author Cole Current
 * @version 10/24/2019
 */
import java.util.Scanner;

public class BuyMovieTickets
{
    public static void main(String[] args)
    {
        //Customer input information
        System.out.println("Hello and Welcome to World Electronics Online!");
        System.out.print("Please enter your first and last name: ");
        Scanner in = new Scanner(System.in);
        String firstName = in.next();
        String lastName = in.nextLine();
        System.out.print("Please enter today's date (mm/dd/yyyy): ");
        String date = in.next();
        date += in.nextLine();
        System.out.print("Please enter the part you will be purchasing: ");
        String part = in.next();
        part += in.nextLine();
        System.out.print("Please enter the amount of parts you will be purchasing: ");
        String partAmount = in.next();
        partAmount += in.nextLine();
        System.out.print("Please enter the part price (ex. $10.00): ");
        String price = in.next();
        price += in.nextLine();
        System.out.print("Please enter your debit card number (####-####-####-####): ");
        String debitCard = in.next();
        debitCard += in.nextLine();
        System.out.print("Please enter the experation date (mm/yy): ");
        String expDate = in.next();
        expDate += in.nextLine();
        System.out.print("Please enter your CVV (###): ");
        String CVV = in.next();
        CVV += in.nextLine();
       
       
        System.out.println();
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
       
        //Recipt
        System.out.println("Your e-Receipt");
        System.out.println();
        System.out.println(date);
        System.out.println("Order number: bd634");
        System.out.println();
        System.out.println("    " + firstName.substring(0) + ". " + lastName);
        System.out.println("  Account Number: ####-####-####-" + debitCard.substring(15,18));
        System.out.println("    Part: " + part);
        System.out.println("    Amount of Part: " + partAmount);
        System.out.println("    Part Price: " + price);
        System.out.println();
       
        //Total Cost
        String priceStr = price.substring(1,5);
        double priceDouble = Double.parseDouble(priceStr);
        String partAmountStr = partAmount.substring(0);
        double partAmountDouble = Double.parseDouble(partAmountStr);
        System.out.println("$" + partAmountDouble * priceDouble + " will be charged to your acount.");
        System.out.println();
        System.out.println("Thank you for shopping at World Electronics Online!");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
    }
   
}