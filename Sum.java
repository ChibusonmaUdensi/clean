import java.util.Scanner;
public class Sum{

public static void main(String [] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter first integer: ");
int number = input.nextInt();

System.out.print("Enter second integer: ");
int number2 = input.nextInt();


int sum = number + number2;

System.out.println("The sum of", (number, "and" number2) is; "+sum);

int difference = number - number2;

System.out.println("The difference is: "+difference);

int product = number * number2;

System.out.println("The product is: "+product);

int average= (number + number2)/2;

System.out.println("The average is: "+average);

}
}