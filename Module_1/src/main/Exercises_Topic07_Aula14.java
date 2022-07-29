package main;

import java.util.Scanner;

public class Exercises_Topic07_Aula14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Array order: ");
		int n = sc.nextInt();
		
		double array[][] = new double[n][n];
		
		for (int i=0; i<n; ++i) {
			for (int j=0; j<n; ++j) {
				System.out.print("Element [" + i + ", " + j + "]: ");
				array[i][j] = sc.nextDouble();
			}
		}
		System.out.println("");
		
		double sum = 0;
		for (int i=0; i<n; ++i) {
			for (int j=0; j<n; ++j) {
				if (array[i][j]>0) {
					sum += array[i][j];
				}
			}
		}
		
		System.out.println("Sum of all positive numbers: " + sum);
		System.out.println("");
		
		System.out.print("Pick up a row: ");
		int row = sc.nextInt();
		
		for (int i=0; i<n; ++i) {
			if (i==row) {
				System.out.print("Chosen row: ");
				for (int j=0; j<n; ++j) {				
					System.out.print(array[i][j] + "   ");
				}
			}
		}
		System.out.println("");
		System.out.println("");
		
		System.out.print("Pick up a column: ");
		int column = sc.nextInt();
		
		for (int j=0; j<n; ++j) {
			if (j==column) {
				System.out.print("Chosen column: ");
				for (int i=0; i<n; ++i) {				
					System.out.print(array[i][j] + "   ");
				}
			}
		}
		System.out.println("");
		System.out.println("");
		
		System.out.print("Main Diagonal: ");
		for (int i=0; i<n; ++i) {
			for (int j=0; j<n; ++j) {
				if (i==j) {
					System.out.print(array[i][j] + "   ");
				}
			}
		}
		System.out.println("");
		System.out.println("");
		
		System.out.println("Modified Matrix: ");
		for (int i=0; i<n; ++i) {
			for (int j=0; j<n; ++j) {
				if (array[i][j]<0) {
					array[i][j] = Math.pow(array[i][j], 2);
				}
				System.out.print(array[i][j] + "   ");
			}
			System.out.println("");
		}
		
		sc.close();		
		
	}

}
