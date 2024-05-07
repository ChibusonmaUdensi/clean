public class minimum {
public static void main(String... args) {

	int[] numbers = {5, 6, 7, 8, 9};
	int[] result = ArrayKata.minimumAndMaximumIn(numbers);
System.out.println(result);

}

public int ArrayKata {
public static int[] minimumAndMaximumIn(int[]numbers) {
int[] result = new int[2];
result[0] = minimum(numbers);
result[1] = MaximumIn(numbers);
return result;
}
}
}