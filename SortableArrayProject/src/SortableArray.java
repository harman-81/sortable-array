import java.util.Arrays;

public class SortableArray {
    // Method to sort an array of integers
    public int[] sortIntegers(int[] numbers) {
        Arrays.sort(numbers);  // Sorts the integer array
        return numbers;
    }

    // Method to sort an array of strings
    public String[] sortStrings(String[] strings) {
        Arrays.sort(strings);  // Sorts the string array
        return strings;
    }

    // Main method for testing
    public static void main(String[] args) {
        SortableArray sorter = new SortableArray();

        // Test sorting integers
        int[] numbers = {5, 3, 8, 1};
        int[] sortedNumbers = sorter.sortIntegers(numbers);
        System.out.println("Sorted Integers: " + Arrays.toString(sortedNumbers));

        // Test sorting strings
        String[] strings = {"banana", "apple", "cherry"};
        String[] sortedStrings = sorter.sortStrings(strings);
        System.out.println("Sorted Strings: " + Arrays.toString(sortedStrings));
    }
}
