//Brandon Forster, Robert Millward,
//William Corlett and Phillip Rajala
//COP 3503 Assignment 3
//Enron E-mail Graphing
//11 November 2012
//M Squared Functionality

package graphjam;

import java.util.Arrays;

public class MSquare {

	private static final int MATRIX_SIZE = 100;
	
	/**
	 * @param args
	 */
	public static void main() {
		// TODO Auto-generated method stub
		
		int matrix1[MATRIX_SIZE][MATRIX_SIZE];
		int matrix2[MATRIX_SIZE][MATRIX_SIZE];
		int matrix3[MATRIX_SIZE][MATRIX_SIZE];
		
		Arrays.fill(matrix1, 0);
		Arrays.fill(matrix2, 0);
		Arrays.fill(matrix3, 0);
		
		for (int i = 0; i < MATRIX_SIZE; i++) {
			for (int j = 0; j < MATRIX_SIZE; j++) {
				if(scanner.bigGraphOfJustice.getNode(i).containsEdge(scanner.bigGraphOfJustice.getNode(j))){
					matrix1[i][j] = 1;
					matrix2[i][j] = 1;
				}	
			}
		}
		
		for(int i = 0; i < MATRIX_SIZE; i++) {
			for(int j = 0; j < MATRIX_SIZE; j++) {
				for(int k = 0; k < MATRIX_SIZE; k++) {
					matrix3[i][j] = matrix1[i][k] * matrix2[k][j];
				}
			}  
		}
		   
		System.out.println(matrix3[MATRIX_SIZE-1][MATRIX_SIZE-1]);
		
	}

}
