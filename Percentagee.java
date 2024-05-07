import java.util.Scanner;
public class Percentagee {
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Welcome to E-store, Please enter customer Name:");
String name = input.nextLine();

System.out.println("Enter percentage discount");
int percentageDiscount = input.nextInt();

int cost = 0;
int total =0;
int sentinel = -1;

while (cost != -1) {
	System.out.print("Please enter cost for item or enter -1 to quit: ");
	cost = input.nextInt();

	total += cost;
}



System.out.println("Customer name:" + name);
	

System.out.println("Original cost:" + total);



if (total >=200) {
	System.out.println("Percentage Discount");
	System.out.println("The Discounted Cost is " + discountedCost);
}
else {
	System.out.println("no discount");
 	}

System.out.println("Thank you for your patronage");
}
}