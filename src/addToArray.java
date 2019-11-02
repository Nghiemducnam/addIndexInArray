import java.util.Scanner;

public class addToArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;

        Scanner scanner = new Scanner(System.in);

        System.out.println("the number which you want to add in array: ");
        int number = scanner.nextInt();

        System.out.println("Enter the index: ");
        int index = scanner.nextInt();

        if (index < 1 || index >= arr.length ) {
            System.out.println("can not insert the index");
        } else {
            for (int j = arr.length - 1; j >= index; j--) {
                arr[j] = arr[j - 1];
            }
            arr[index] = number;

            for (int i = 0; i < arr.length; i++) {
                System.out.print(+ arr[i] + ",");
            }
        }
    }
}
