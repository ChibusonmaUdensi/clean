import java.util.Scanner;

public class sevensegmentdisplay {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter binary Number ");

        int value = input.nextInt();

        String valToString = String.valueOf(value);

        inputValue(valToString);
        display();
	}

	private static final int[][] matrix = new int[5][4]; 

	public static void segmentA() { 
		matrix[0][0] = 1;
		matrix[0][1] = 1;
		matrix[0][2] = 1;
		matrix[0][3] = 1;

	}

	public static void segmentB() {
		matrix[0][3] = 1;
		matrix[1][3] = 1;
		matrix[2][3] = 1;

	}

	public static void segmentC() {
		matrix[2][3] = 1;
		matrix[3][3] = 1;
		matrix[4][3] = 1;

	}

	public static void segmentD() {
		matrix[4][0] = 1;
		matrix[4][1] = 1;
		matrix[4][2] = 1;
		matrix[4][3] = 1;

	}

	public static void segmentE() {
		matrix[2][0] = 1;
		matrix[3][0] = 1;
		matrix[4][0] = 1;


	}

	public static void segmentF() {
		matrix[0][0] = 1;
		matrix[1][0] = 1;
		matrix[2][0] = 1;


	}

	public static void segmentG() {
		matrix[2][0] = 1;
		matrix[2][1] = 1;
		matrix[2][2] = 1;
		matrix[2][3] = 1;


	}

	public static void display() {
		for(int[] i : matrix){
			for(int j : i){
				if(j == 1){
					System.out.print("# ");
				} else 
					System.out.print("  ");									
			}
		System.out.println();
		}



	}
	public static void inputValue(String value)  {
        if (value.length() > 9){
            value = value.substring(0, 9);
        }


        for (int i = 0; i < value.length(); i++){
            if (value.charAt(i) == '1'|| '0' && value.charAt(7) == '1'){
                switch (i){
                    case 0-> segmentA();
                    case 1-> segmentB();
                    case 2-> segmentC();
                    case 3-> segmentD();
                    case 4-> segmentE();
                    case 5-> segmentF();
                    case 6-> segmentG();
                }
            }
        }
    }

   }