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
}