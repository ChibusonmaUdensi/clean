import java.util.Scanner;
public class Count {

   public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter a number: ");
int num = input.nextInt();
System.out.println("Enter a number: ");
int num1 = input.nextInt();
System.out.println("Enter a number: ");
int num2 = input.nextInt();
System.out.println("Enter a number: ");
int num3 = input.nextInt();

int positiveCount =0;
int negativeCount =0;
int zeros =0;    

for (int i = 0; i < number.length; ++i) {

      if (number[i] > 0) // positive
        ++positiveCount;

      else                 // negative
        ++negativeCount;

System.out.printf("The Number of Positives = ", + positiveCount);
               
 }
}
}