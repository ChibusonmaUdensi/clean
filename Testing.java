public class Testing {
public static void main(String [] args) {

System.out.printf("%10s%10s%10s%10s", "ITEM", "QUANTITY", "PRICE",   "TOTAL");
}

System.out.printf("%10s%10d%10d%10d", "rice", 43, 85, 1906);


}



import java.util.Scanner;
import java.util.ArrayList;

	public class Checkout {

	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moreItems;

	System.out.println("What is your customer's name?");
	String name = scanner.nextLine();
		
	double total = 0;


        do {
            System.out.println("What did the user buy? ");
            String productName = scanner.nextLine();

            System.out.println("How many pieces? ");
            int quantity = scanner.nextInt();

		
            System.out.println("How much per unit? ");
            double price = scanner.nextDouble();

		scanner.nextLine();	

            
	    System.out.println("Do you want to add more items? (yes/no): ");
             moreItems = scanner.next().toLowerCase();
	   
		total += price * quantity;
	
             } while (moreItems.equals("yes"));
		
		//System.out.println("What is your name?");
               //String cashierName = scanner.nextLine();
	
		System.out.println("What is your name? ");
		String cashierName = scanner.nextLine();

		System.out.println("How much discount will he get?: ");
               double discount = scanner.nextInt();

		
     


	     //initialize an array to hold product and prices




        System.out.println("Thank you for shopping!");
            }
 }