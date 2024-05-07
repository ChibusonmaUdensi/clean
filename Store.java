import java.util.Scanner;


	public class Store {
	public static void main (String [] args) {

	Scanner input = new Scanner(System.in);
	
	String[] names = new String[5];
	


	for (int counter = 0; counter < 5; counter++) {

	System.out.println("Enter the names: ");
	String name;
	name = input.nextLine();
	names[counter] = name;
	}


	for (int count = 0; count < 5; count++) {
	System.out.println(names[count]);
	}


	}
}