
   import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinearSearchTest {

    @Test
    public void testLinearSearch() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
		int n = array.length;
        int result = LinearSearch.search(array,n, target);

        assertEquals(2, result);
    }

    @Test
    public void testLinearSearchNotFound() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;
		int n = array.length;
        int result = LinearSearch.search(array,n, target);

        assertEquals(-1, result);
    }

    @Test
    public void testLinearSearchEmptyArray() {
        int[] array = {};
        int target = 3;
		int n = array.length;
        int result = LinearSearch.search(array,n, target);

        assertEquals(-1, result);
    }
}

  
