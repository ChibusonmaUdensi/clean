import java.util.Scanner;
public class Zeros {

public static void main (String[] args) {


int count =0;
int positiveCount =  0;
int negativeCount = 0;
int zeroCount = 0;

Scanner input = new Scanner(System.in);

System.out.println("Enter a number or press -1 to end");
int number = input.nextInt();

while (number != -1) {
count ++;
   
System.out.println("Enter a number or press -1 to end");
 number = input.nextInt();


if ( number > 0){
positiveCount++;
  System.out.println("Positive");
}

if ( number < 0){
negativeCount ++;
  System.out.println("Negative");
}
 if (number == 0) {
zeroCount ++;
  System.out.println("Zeros");
}

}
   }
 





}