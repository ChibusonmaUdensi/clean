import java.util.Scanner;
public class Number {
public static void main(String [] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter new integer: ");
int number = scanner.nextInt();


System.out.print("Enter second integer: ");
int number1 = scanner.nextInt();

System.out.print("Enter third integer: ");
int number2 = scanner.nextInt();

System.out.print("Enter fourth integer: ");
int number3 = scanner.nextInt();

System.out.print("Enter sum of integers: ");
int sum = number + number1 + number2 + number3;

System.out.printf("The sum is %d%n", sum);
   }
} 