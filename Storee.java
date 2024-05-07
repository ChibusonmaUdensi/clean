import java.util.Scanner;


	public class Storee {
	public static void main (String [] args) {

	Scanner input = new Scanner(System.in);
	
	int[] age = new int[5];
	


	for (int counter = 0; counter < 5; counter++) {

	System.out.println("Enter the ages: ");
	int ages = input.nextInt();
	age[counter] = ages;
	}


	for (int count = 0; count < 5; count++) {
	System.out.println(age[count]);
	}


	}
