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

		//diagonal
		
		
}}
