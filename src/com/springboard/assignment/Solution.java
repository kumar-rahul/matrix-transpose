package com.springboard.assignment;


public class Solution {
	
	private int[][] transpose(int size, int[][] matrix) {
		int transpose[][]=new int[size][size];
		for(int i=0;i<size;i++){    
			for(int j=0;j<size;j++){    
				transpose[i][j]=matrix[j][i];  
			}    
		}   
//		System.out.println("----Transpose----");
//		print(size, transpose);

		return transpose;
	}
	
	private int[][] vFLip(int size, int[][] matrix) {
		int arr[][]=new int[size][size];
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				arr[i][j] = matrix[size-1-j][i];				
			}
		}
//		System.out.println("----vFLip----");
//		print(size, arr);

		return arr;
	}
	
	private int[][] hFLip(int size, int[][] matrix) {
		int arr[][]=new int[size][size];
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				arr[i][j] = matrix[i][size-1-j];
			}
		}
//		System.out.println("----hFLip----");
//		print(size, arr);

		return arr;
	}
	
	private void print(int size, int[][] matrix) {
		for(int i=0;i<size;i++){    
			for(int j=0;j<size;j++){    
				System.out.print(matrix[i][j]+" ");    
			}    
			System.out.println();
		} 
	}
	
	public void decrypt(int size, String sequence, int matrix[][]) {
		int len = sequence.length();
		for (int i=0; i<len; i++) {
			String ch = sequence.charAt(i) + "";
			if (ch.equalsIgnoreCase("T")) {
				matrix = transpose(size, matrix);
			} else if (ch.equalsIgnoreCase("V")) {
				matrix = vFLip(size, matrix);
			} else if(ch.equalsIgnoreCase("H")) {
				matrix = hFLip(size, matrix);
			}
		}
//		System.out.println("----Result----");
		print(size, matrix);
	}
	
}
