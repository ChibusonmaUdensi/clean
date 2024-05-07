import java.util.Scanner;
public class TaxCalculator {

public static void main(String [] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter account number: ");
int number = scanner.nextInt();

System.out.print("Enter balance at the beginning of the month: ");
int number2 = scanner.nextInt();

System.out.print("Total of all items charged by customers this month: ");
int number3 = scanner.nextInt();

System.out.print("Total of all credits applied to customers account this month: ");
int number4 = scanner.nextInt();

System.out.print("Allowed credit limit: ");
int number5 = scanner.nextInt();

//System.out.println("Calculate new balance: ");
int newBalance =(number2 + number3) - number5;

if (newBalance > number5 ){

System.out.println("Credit limit exceeded: ");
}
 }
}