public class PrimeNumber {
    public static boolean isPalindrome(int number) {
        String numString = String.valueOf(number);
        int length = numString.length();
        
        // Check if the number has 5 digits
        if (length != 5) {
            return false;
        }
        
        // Check if the number is a palindrome
        for (int i = 0; i < length / 2; i++) {
            if (numString.charAt(i) != numString.charAt(length - i - 1)) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int number = 54145;
}
}