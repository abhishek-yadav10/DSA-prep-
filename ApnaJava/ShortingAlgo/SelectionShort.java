package ShortingAlgo;

public class SelectionShort {

    // Selection sort function
    public static void selectionShort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i; // Assume current i is minimum
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j; // Update min index if smaller element found
                }
            }

            // Swap arr[i] and arr[min]
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    // Print the sorted array
    public static void printShort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {9, 8, 6, 5, 7, 3, 4, 1, 2};
        selectionShort(arr);   // Sorting
        printShort(arr);       // Printing the sorted array
    }
}
