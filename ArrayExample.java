import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declaring an array of integers with user-defined size
        int[] numbers = new int[size];

        // Getting input values from the user and storing them in the array
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value for index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Printing the elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        scanner.close(); // Closing the scanner object
    }
}
