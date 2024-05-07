import java.util.Scanner;
	public class Scoress {
	 public static void main (String [] args){

Scanner input = new Scanner(System.in);

int sum = 0;
int i = 0; 

for (i = 1; i <= 10; i++) {
System.out.print("Enter an integer: ");
	int num =input.nextInt();
	sum +=num;
}
	System.out.println("sum is: " +sum);
int ave = 10;
 int average = (sum / ave);

System.out.println("average is: " +average);


	}
}
