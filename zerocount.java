import java.util.Scanner;
	public class ZeroCount {
	  public static void main (String[] args){

Scanner input = new Scanner(System.in); 
    

int positiveCount = 0;
int negativeCount = 0;
int zeroCount = 0;


while (true)  {
	System.out.print("Enter a number or (enter -1 to stop): "); 
	    int number = input.nextInt();



if (number > 0) {
	positiveCount++;
}
 else if (number < 0) {
	negativeCount++;
}
else {
	zeroCount++;
}

if (number == -1) {
                break;
 	
}
}

System.out.println("Count of positive numbers:" + positiveCount);
System.out.println("Count of negative numbers:" + negativeCount);
System.out.println("Count of zeros:" + zeroCount);

   }
}