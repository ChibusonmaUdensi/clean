import java.util.Scanner;
public class Percentage {
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Welcome to E-store, Please enter customer Name:");
String name = input.nextLine();


int total =0;
int discount = 10;
sentinel = -1;

while  (sentinel = -1) {
	System.out.print("Please enter cost for item (enter -1 to quit)" );
	int cost = input.nextInt();
total += cost;
 }


double discounted = total * discount / 100;
double discountedCost = total - discounted;



System.out.println("Customer name:" + name);
	

System.out.println("Original cost:" + total);



if (total >=200) {
System.out.printf("Enter percentage discount", + discount);
System.out.println("The Discounted Cost is " + discountedCost);
	}
else {
System.out.println("no discount");
 	}

System.out.println("Thank you for your patronage");
}
}