import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Reverse the string
        String reversedString = "";
        for (int i = inputString.length()-1;i>=0; i--) { // Intentional error: Incorrect loop condition
            reversedString += inputString.charAt(i);
        }

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }
}