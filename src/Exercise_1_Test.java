package src;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class Exercise_1_Test {
    @Test
    public void testDecendBinary(){
        Integer[] decendIntList = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        assert Exercise_1.binSearch(decendIntList, 15) == false;
        assert Exercise_1.binSearch(decendIntList, 8) == true;
    }

    @Test
    public void testSqrt(){
        assert Exercise_1.squareRoot(9) == 3;
        assert Exercise_1.squareRoot(25) == 5;
        assert Exercise_1.squareRoot(64) == 8;
    }

    @Test
    public void testInsertionSort(){
        int[] expectedResult ={2, 4, 8, 3, 7, 9, 1, 0, 5, 6};
        int[] testArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = Exercise_1.insertionSort(testArray);

        Assert.assertArrayEquals(expectedResult, result);
    }
    
}
