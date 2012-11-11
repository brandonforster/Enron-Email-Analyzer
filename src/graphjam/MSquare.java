//Brandon Forster, Robert Millward,
//William Corlett and Phillip Rajala
//COP 3503 Assignment 3
//Enron E-mail Graphing
//11 November 2012
//M Squared Functionality

package graphjam;

import java.util.Arrays;

public class MSquare {

	//constant so there aren't any magic numbers in the code
	private static final int MATRIX_SIZE = 100;
	
	public static void main() {
		//declare our matricies three
		int matrix1[][]= new int[MATRIX_SIZE][MATRIX_SIZE];
		int matrix2[][]= new int[MATRIX_SIZE][MATRIX_SIZE];
		int matrix3[][]= new int[MATRIX_SIZE][MATRIX_SIZE];
		
		//initialize all matricies to zeroes
		Arrays.fill(matrix1, 0);
		Arrays.fill(matrix2, 0);
		Arrays.fill(matrix3, 0);
		
		//if there is an edge from i to j, set value accordingly
		for (int i = 0; i < MATRIX_SIZE; i++) {
			for (int j = 0; j < MATRIX_SIZE; j++) {
				if(scanner.bigGraphOfJustice.getNode(i).containsEdge(scanner.bigGraphOfJustice.getNode(j))){
					matrix1[i][j] = 1;
					matrix2[i][j] = 1;
				}	
			}
		}
		
		//calculate M^2
		for(int i = 0; i < MATRIX_SIZE; i++) {
			for(int j = 0; j < MATRIX_SIZE; j++) {
				for(int k = 0; k < MATRIX_SIZE; k++) {
					matrix3[i][j] = matrix1[i][k] * matrix2[k][j];
				}
			}  
		}
		
		//print entry 100, 100 in M^2
		System.out.println(matrix3[MATRIX_SIZE-1][MATRIX_SIZE-1]);
		
	}

}
