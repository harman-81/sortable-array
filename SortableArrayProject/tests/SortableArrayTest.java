import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SortableArrayTest {
    @Test
    public void testSortIntegers() {
        SortableArray sorter = new SortableArray();
        int[] numbers = {5, 3, 8, 1};
        int[] sorted = sorter.sortIntegers(numbers);
        assertArrayEquals(new int[]{1, 3, 5, 8}, sorted);  // Checks if sorted correctly
    }
}