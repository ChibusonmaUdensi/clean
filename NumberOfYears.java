import java.util.Scanner;
public class NumberOfYears{

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter the minutes: ");
int minutes = scanner.nextInt();

int minutesPerDay = 24 * 60;
int minutesPerYear = minutesPerDay * 365;
int year = minutes/minutesPerYear;
int day = (minutes - year * minutesPerYear)/minutesPerDay;
 
System.out.println(year);
System.out.println(day);


}


}