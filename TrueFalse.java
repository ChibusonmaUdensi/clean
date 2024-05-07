import java.util.Scanner;
	public class TrueFalse {
	  public static void main(String[] args){
 	

Scanner input = new Scanner(System.in);

System.out.print("Enter an integer: ");
int number = input.nextInt();

boolean condition = true;


if ((number % 2) == 0) {
	System.out.print("true");
} else {
	System.out.print("false");
}
	}
  }