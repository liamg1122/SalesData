/*
 * Class: CMSC203 
 * Instructor: Gary Thai
 * Description: Calculates holiday bonuses for each store using utility functions
 * Due: 12/1/2023
 * Platform/compiler: Eclpise
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Liam Ghershony
*/

public class HolidayBonus {

    private static final double HIGHEST_SALES_BONUS = 5000.0;
    private static final double LOWEST_SALES_BONUS = 1000.0;
    private static final double OTHER_STORES_BONUS = 2000.0;

    public static double[] calculateHolidayBonus(double[][] salesData) {
        double[] storeBonuses = new double[salesData.length];

        for (int storeIndex = 0; storeIndex < salesData.length; storeIndex++) {
            for (int categoryIndex = 0; categoryIndex < salesData[storeIndex].length; categoryIndex++) {
            	
            	double storeSales = salesData[storeIndex][categoryIndex];
            	
            	double highestCategorySales = TwoDimRaggedArrayUtility.getHighestInColumn(salesData, categoryIndex);
                double lowestCategorySales = TwoDimRaggedArrayUtility.getLowestInColumn(salesData, categoryIndex);

                

                if (storeSales > 0) {
                	if (storeSales == lowestCategorySales) {
                        storeBonuses[storeIndex] += LOWEST_SALES_BONUS;
                    }
                	else if (storeSales == highestCategorySales) {
                        storeBonuses[storeIndex] += HIGHEST_SALES_BONUS;
                    }  else {
                        storeBonuses[storeIndex] += OTHER_STORES_BONUS;
                    }
                }
            }
        }
        return storeBonuses;
    }

    public static double calculateTotalHolidayBonus(double[][] salesData) {
        double[] storeBonuses = calculateHolidayBonus(salesData);
        double totalBonuses = 0.0;

        for (double bonus : storeBonuses) {
            totalBonuses += bonus;
        }
        return totalBonuses;
    }
}

