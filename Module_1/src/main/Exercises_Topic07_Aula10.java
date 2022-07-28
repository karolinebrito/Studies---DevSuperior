package main;

import java.util.Scanner;

public class Exercises_Topic07_Aula10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of rows: ");
		int n = sc.nextInt();
		System.out.print("Number of columns: ");
		int m = sc.nextInt();

		double array[][] = new double[n][m];
		
		for (int i=0; i<n; ++i) {
			for (int j=0; j<m; ++j) {
				System.out.print("Element [" + i + ", " + j + "]: ");
				array[i][j] = sc.nextInt();
			}
		}
		System.out.println("");
		
		System.out.println("Negative values: ");
		for (int i=0; i<n; ++i) {
			for (int j=0; j<m; ++j) {
				if (array[i][j]<0) {
					System.out.println(array[i][j]);;
				}
			}
		}
		
		sc.close();

	}

}
