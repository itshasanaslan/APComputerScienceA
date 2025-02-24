package unit8;

import java.util.Arrays;

import unit6.ArrayManipulator;

public class Program {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[] array = new int[4];
		array[0] = 1;
		array[1] = 2;
		
		int[] newArray = {1,2,3,4};
		
		
		int[][] matrix = new int[4][4];
		
		
		int firstLine= 0;
		int firstColumn = 0;
		
		matrix[firstLine][firstColumn] = 1;
		matrix[1][2] = 99;
		matrix[3][1] = 2;
		System.out.println(ArrayManipulator.get2DArrayAsString(matrix));

		int[][] anotherMatrix = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
				};
		
		System.out.println(ArrayManipulator.get2DArrayAsString(anotherMatrix));
		calculateSumsinMatrix(anotherMatrix);
		//diagonal
		
		int sum = 0;
		
		sum += anotherMatrix[0][0] +anotherMatrix[1][1] + anotherMatrix[2][2];
		
		
		// 0 -100
	
		//calculate the sum of even numbs
		// calculate the sum of odd numbs
		
		int[][] random2D = generateRandom2D(100);
		System.out.println(ArrayManipulator.get2DArrayAsString(random2D));
		calculateSumsinMatrix(random2D);
		
	}
	
	public static int findDiagonalSum(int[][] matrix) {
		
		int sum = 0;
		
		for (int i = 0; i < matrix.length; i++ ) {
			sum += matrix[i][i];
		}
		return sum;
	}


	
	// range implies the number of rows and cols
	public static int[][] generateRandom2D(int range){
		
		int[][] matrix = new int[range][range];
		
		for (int row = 0; row < range; row++) {
			for (int col = 0; col < range; col++) {
				matrix[row][col]  = (int) (Math.random() * (100 - 0 + 1)) + 0;
			}
		}
		
		
		return matrix;
		
	}
	
	public static void calculateSumsinMatrix(int[][] matrix) {
		
		int sumOfEven = 0;
		int sumOfOdd = 0;
		
		
		for (int row = 0; row < matrix.length; row++) {
			
			for (int col = 0; col < matrix[row].length; col++) {
				
				if (matrix[row][col] % 2 == 0)  {
					sumOfEven += matrix[row][col];
				}
				else {
					sumOfOdd += matrix[row][col];
				}
			}
			
		}
		System.out.println("Sum of odds: " + sumOfOdd);
		System.out.println("Sum of even: " + sumOfEven);
		System.out.println("Total: " + (sumOfOdd + sumOfEven));

		
	}
	

}
