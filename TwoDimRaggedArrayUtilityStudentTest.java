/*
 * Class: CMSC203 
 * Instructor: Gary Thai
 * Description: Tests 2d array with twodimraggedarray util methods comprehensively
 * Due: 12/1/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Liam Ghershony
*/


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

public class TwoDimRaggedArrayUtilityStudentTest {

  
    @Test
    public void testWriteToFile() throws IOException {
        double[][] raggedArray = {{1, 2, 9.3}, {4, 5.5}, {1.2}};
        File file = new File("this.txt");
        TwoDimRaggedArrayUtility.writeToFile(raggedArray, file);
        assertTrue(file.exists());
    }

    @Test
    public void testGetTotal() {
        double[][] raggedArray = {{1.1, 2.2, 3.3}, {4.4, 5.5}, {6.6}};
        assertEquals(23.1, TwoDimRaggedArrayUtility.getTotal(raggedArray));
    }


    @Test
    public void testGetRowTotal() {
        double[][] raggedArray = {{1.1, 2.2, 3.3}, {4.4, 5.5}, {6.6}};
        assertEquals(6.6, TwoDimRaggedArrayUtility.getRowTotal(raggedArray, 0));
    }

    @Test
    public void testGetLowestInArray() {
        double[][] raggedArray = {{1.1, 2.2, 3.3}, {4.4, 5.5}, {6.6}};
        assertEquals(1.1, TwoDimRaggedArrayUtility.getLowestInArray(raggedArray));
    }
    
    @Test
    public void testGetColumnTotal() {
        double[][] raggedArray = {{1.1, 2.2, 3.3}, {4.4, 5.5}, {6.6}};
        assertEquals(12.1, TwoDimRaggedArrayUtility.getColumnTotal(raggedArray, 0));
    }

    @Test
    public void testGetHighestInRow() {
        double[][] raggedArray = {{1.1, 2.2, 3.3}, {4.4, 5.5}, {6.6}};
        assertEquals(3.3, TwoDimRaggedArrayUtility.getHighestInRow(raggedArray, 0));
    }

    @Test
    public void testGetHighestInRowIndex() {
        double[][] raggedArray = {{1.1, 2.2, 3.3}, {4.4, 5.5}, {6.6}};
        assertEquals(2, TwoDimRaggedArrayUtility.getHighestInRowIndex(raggedArray, 0));
    }

    @Test
    public void testGetLowestInRow() {
        double[][] raggedArray = {{1.1, 2.2, 3.3}, {4.4, 5.5}, {6.6}};
        assertEquals(1.1, TwoDimRaggedArrayUtility.getLowestInRow(raggedArray, 0));
    }

    @Test
    public void testGetLowestInRowIndex() {
        double[][] raggedArray = {{1.1, 2.2, 3.3}, {4.4, 5.5}, {6.6}};
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(raggedArray, 0));
    }

    @Test
    public void testGetHighestInColumn() {
        double[][] raggedArray = {{1.1, 2.2, 3.3}, {4.4, 5.5}, {6.6}};
        assertEquals(3.3, TwoDimRaggedArrayUtility.getHighestInColumn(raggedArray, 2));
    }

    @Test
    public void testGetHighestInColumnIndex() {
        double[][] raggedArray = {{1.1, 2.2, 3.3}, {99.0, 5.5}, {100.99}};
        assertEquals(2, TwoDimRaggedArrayUtility.getHighestInColumnIndex(raggedArray, 0));
    }

    @Test
    public void testGetLowestInColumn() {
        double[][] raggedArray = {{-1.1, 2.2, 3.3}, {4.4, 5.5}, {6.6}};
        assertEquals(-1.1, TwoDimRaggedArrayUtility.getLowestInColumn(raggedArray, 0));
    }

    @Test
    public void testGetLowestInColumnIndex() {
        double[][] raggedArray = {{1.1, 2.2, 3.3}, {4.4, 5.5}, {6.6}};
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(raggedArray, 0));
    }

    @Test
    public void testGetHighestInArray() {
        double[][] raggedArray = {{1.1, 2.2, 3.3}, {4.4, 5.5}, {6.6}};
        assertEquals(6.6, TwoDimRaggedArrayUtility.getHighestInArray(raggedArray));
    }

 
}

