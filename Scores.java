import java.util.Scanner;
	public class Scores {
	
	public static void main (String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	
	System.out.print("Enter Student Name : ");

	
	String studentName = scanner.nextLine();

	
	
	System.out.print("Enter Student Score 1:");
	
	int number1 = scanner.nextInt();

	System.out.print("Enter Student Score 2:");

	int number2 = scanner.nextInt();

	
	System.out.print("Enter Student Score 3:");

	int number3 = scanner.nextInt();

	int sum = number1 + number2 +  number3;

	// System.out.printf("Sum is %d%n", sum);

	
	if( sum >= 100) {
		System.out.printf(" Invalid Score, Cannot Print!! ");
	
		}

	/***else if ( sum >= 50) {

	System.out.printf("%s Passed by %d", studentName, sum);
	
	}

	else {

	
	System.out.printf("%s failed by %d", studentName, sum);
	}  ***/

	
	





else if (sum >= 80) {
	System.out.printf("%s passed by A and your score is  %d", studentName, sum);
}
else if (sum >= 70) {
 
	System.out.printf("%s passed by B and your score is  %d", studentName, sum);
 }
 else if (sum >= 50) {

	System.out.printf("%s passed by C and your score is  %d", studentName, sum);
 }
 else if (sum >= 40) {

	System.out.printf("%s failed by D and your score is  %d", studentName, sum);
	}

 else {

	System.out.printf("%s failed by F and your score is  %d", studentName, sum);
	 }
	 

}

}
