import java.util.Scanner;

public class FindEndOfPositive {

    public static int findIndex(int[] arr) {
        int index = 0;
        while (arr[index] != -1) {
            index++;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements (positive integers and -1): ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Index where -1 starts: " + findIndex(arr));

        scanner.close();
    }
}