package main;

import java.util.Scanner;

public class Exercises_Topic07_Aula13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Array order: ");
		int n = sc.nextInt();
		
		int array[][] = new int[n][n];
		
		for (int i=0; i<n; ++i) {
			for (int j=0; j<n; ++j) {
				System.out.print("Element [" + i + ", " + j + "]: ");
				array[i][j] = sc.nextInt();
			}
		}
		System.out.println("");
		
		double sum = 0;
		for (int i=0; i<n; ++i) {
			for (int j=0; j<n; ++j) {
				if (j>i) {
					sum += array[i][j];
				}
			}
		}
		System.out.println("SUM OF ELEMENTS ABOVE MAIN DIAGONAL = " + sum);
		
		
		sc.close();

	}

}
