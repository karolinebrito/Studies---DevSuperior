package main;

import java.util.Scanner;

public class Exercises_Topic07_Aula12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of rows: ");
		int n = sc.nextInt();
		System.out.print("Number of columns: ");
		int m = sc.nextInt();
		System.out.println("");

		double array1[][] = new double[n][m];
		double array2[][] = new double[n][m];
		
		System.out.println("Array Number 1: ");
		for (int i=0; i<n; ++i) {
			for (int j=0; j<m; ++j) {
				System.out.print("Element [" + i + ", " + j + "]: ");
				array1[i][j] = sc.nextInt();
			}
		}
		System.out.println("");
		
		System.out.println("Array Number 2: ");
		for (int i=0; i<n; ++i) {
			for (int j=0; j<m; ++j) {
				System.out.print("Element [" + i + ", " + j + "]: ");
				array2[i][j] = sc.nextInt();
			}
		}
		System.out.println("");
		
		System.out.println("RESULT: ");
		double sumArray[][] = new double[n][m];
		for (int i=0; i<n; ++i) {
			for (int j=0; j<m; ++j) {
				sumArray[i][j] = array1[i][j] + array2[i][j];
				System.out.print(sumArray[i][j] + "   ");
			}
			System.out.println("");
		}
		
		sc.close();

	}

}
