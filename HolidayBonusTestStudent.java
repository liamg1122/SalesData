/*
 * Class: CMSC203 
 * Instructor: Gary Thai
 * Description: Tests 2d array with holiday bonus methods
 * Due: 12/1/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Liam Ghershony
*/




import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class HolidayBonusTestStudent {

    @Test
    public void testCalculateHolidayBonus() {
        double[][] salesData = {
                {0, 0, 50},
                {300, 50, 400},
                {250, 150, 100},
        };
        
        
        double[] expectedBonuses = HolidayBonus.calculateHolidayBonus(salesData);
        
        assertEquals(1000.0, expectedBonuses[0]);
        assertEquals(12000.0, expectedBonuses[1]);
        assertEquals(9000.0, expectedBonuses[2]);
    }

	@Test
    public void testCalculateTotalHolidayBonus() {
        double[][] salesData = {
        		{0, 0, 50},
                {300, 50, 400},
                {250, 150, 100},
        };

        assertEquals(22000.0, HolidayBonus.calculateTotalHolidayBonus(salesData));
    }
}


