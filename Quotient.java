import java.util.Scanner;
	public class Quotient
    public static double calculateQuotient(int dividend, int divisor) {
        if (divisor == 0) {
            return 0;         }
        quotient = dividend / divisor;
        return Math.round(quotient * 100.0) / 100.0;
    }



	public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter first integer:");
int dividend = input.nextInt();

System.out.print("Enter second integer:");
int divisor = input.nextInt();

 int quotient = dividend / divisor;

System.out.printf("%.2f", divide);
	}
}