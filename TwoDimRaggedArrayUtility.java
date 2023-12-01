/*
 * Class: CMSC203 
 * Instructor: Gary Thai
 * Description: Utility class that handles two-dimensional arrays in many ways
 * Due: 12/1/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Liam Ghershony
*/




import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TwoDimRaggedArrayUtility {

	//1
	 public static double[][] readFile(File file) throws IOException {
	        int rowsCount = countRows(file);
	        double[][] raggedArray = new double[rowsCount][];

	        try (BufferedReader bread = new BufferedReader(new FileReader(file))) {
	            String readThisLine;
	            int row = 0;

	            while ((readThisLine = bread.readLine()) != null) {
	                String[] parts = readThisLine.trim().split("\\s+");
	                double[] rowValues = new double[parts.length];

	                for (int i = 0; i < parts.length; i++) {
	                    rowValues[i] = Double.parseDouble(parts[i]);
	                }

	                raggedArray[row++] = rowValues;
	            }
	        }

	        return raggedArray;
	    }
	 

	    private static int countRows(File file) throws IOException {
	        int count = 0;
	        try (BufferedReader bread = new BufferedReader(new FileReader(file))) {
	            while (bread.readLine() != null) {
	                count++;
	            }
	        }
	        return count;
	    }

			
// 2
	public static void writeToFile(double[][] raggedArray, File file) throws IOException {
		
		try(BufferedWriter bwrite = new BufferedWriter( new FileWriter(file))){
			
			for( double[] row: raggedArray) {
				for (int i =0; i<row.length; i++) {
					bwrite.write(String.valueOf(row[i]));
					if(i != row.length -1) {
						bwrite.write(" ");
					}
				} 
				
				bwrite.newLine();
				
			}
			
			
		}
				
	}
	
	//3
	public static double getTotal(double[][] raggedArray) {
		double total = 0;
		for (double row[]: raggedArray) {
			for (double val: row) {
				
				total += val;
				
			}
		}
		
		return total;
	}
	
	//4
	public static double getAverage(double[][] raggedArray) {
		
		double elements =0;
		
		for (double row[]: raggedArray) {
			elements += row.length;
		}
		
		double avg = elements / getTotal(raggedArray);
		
		if(elements > 0) {
		return avg; 
		
		}
		
		else {
			
			return 0;
			
		}
		
		
	}
	
	//5
	public static double getRowTotal(double[][] raggedArray, int rowIndex) {
		
		double rowTotal = 0;
		if (rowIndex >= 0 && rowIndex <= raggedArray.length) {
			for (double val : raggedArray[rowIndex]) {
				rowTotal += val;
			}
		}
		return rowTotal;
}
	
	//6
	public static double getColumnTotal( double[][] raggedArray, int colIndex) {
		
		double colTotal = 0;
		for (double row[]: raggedArray) {
			if (colIndex >= 0 && colIndex < row.length) {
				colTotal += row[colIndex];
			}
			else {
				return 0;
			}
		}
		
		return colTotal;
	}
	
	//7
	public static double getHighestInRow( double[][] raggedArray, int rowIndex) {
		
		double max = 0;
		if( rowIndex >= 0 && rowIndex <= raggedArray.length) {
			for (double init : raggedArray[rowIndex]) {
				if(init > max) {
					max = init;
				}
			}
		}
		
		return max;
	}
	
	
	//8
	public static double getHighestInRowIndex(double[][] raggedArray, int rowIndex) {
		
		int highIndex = 0;
		double highestVal = 0;
		
		if (rowIndex >= 0 && rowIndex < raggedArray.length) {
			double[] row = raggedArray[rowIndex];
			for(int i = 0; i< row.length; i++) {
				if (row[i]> highestVal) {
					highestVal = row[i];
					highIndex = i;
				}
			}
		}
		
		return highIndex;
		
		
	}
	
	
	//9
	public static double getLowestInRow( double[][] raggedArray, int rowIndex) {
		
		double min = Double.MAX_VALUE;
		if( rowIndex >= 0 && rowIndex <= raggedArray.length) {
			for (double init : raggedArray[rowIndex]) {
				if(init < min) {
					min = init;
				}
			}
		}
		
		return min;
	}
	
	
	//10
	public static double getLowestInRowIndex(double[][] raggedArray, int rowIndex) {
		
		int lowestIndex = -1;
		double lowestVal = Double.MAX_VALUE;
		
		if (rowIndex >= 0 && rowIndex < raggedArray.length) {
			double[] row = raggedArray[rowIndex];
			for(int i = 0; i< row.length; i++) {
				if (row[i] < lowestVal) {
					lowestVal = row[i];
					lowestIndex = i;
				}
			}
		}
		
		return lowestIndex;
		
		
	}
	
	
	
	//11
	public static double getHighestInColumn(double[][] raggedArray, int colIndex) {
		
		double highInCol = 0;
		for (double[] row : raggedArray) {
			if(colIndex >=0 && colIndex < row.length && row[colIndex] > highInCol) {
				highInCol = row[colIndex];
			}
		}
		
		return highInCol;
	}
	
	
	//12
	public static int getHighestInColumnIndex(double[][] raggedArray, int colIndex) {
		
		double highInCol = 0;
		int highCIndex = -1;
		for (int i = 0; i <raggedArray.length; i++) {
			if(colIndex >=0 && colIndex < raggedArray[i].length && raggedArray[i][colIndex] > highInCol) {
				highInCol =raggedArray[i][colIndex];
				highCIndex = i;
			}
		}
		
		return highCIndex;
		
	}
	
//13
	public static double getLowestInColumn(double[][] raggedArray, int colIndex) {
		
		double lowest = Double.MAX_VALUE;
		for (double[] row : raggedArray) {
			if(colIndex >=0 && colIndex < row.length && row[colIndex] < lowest) {
				lowest = row[colIndex];
			}
		}
		
		return lowest;
	}
	
	//14
public static int getLowestInColumnIndex(double[][] raggedArray, int colIndex) {
		
	    double lowest = Double.MAX_VALUE;
		int lowestIndex = -1;
		for (int i = 0; i <raggedArray.length; i++) {
			if(colIndex >=0 && colIndex < raggedArray[i].length && raggedArray[i][colIndex] < lowest) {
				lowest = raggedArray[i][colIndex];
				lowestIndex = i;
			}
		}
		
		return lowestIndex;
		
	}
//15
public static double getHighestInArray(double[][] raggedArray) {
	
	
	double highest = 0;
	for (double[] rows: raggedArray) {
		for(double val: rows) {
			if(val > highest) {
				highest = val;
			}
		}
		
	}

return highest;	
	
}

//16
public static double getLowestInArray(double[][] raggedArray) {
	
	
	double lowest = Double.MAX_VALUE;
	for (double[] rows: raggedArray) {
		for(double val: rows) {
			if(val < lowest) {
				lowest = val;
			}
		}
		
	}

return lowest;	
	
}
	
}
