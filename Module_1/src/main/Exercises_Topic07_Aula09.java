package main;

import java.util.Scanner;

public class Exercises_Topic07_Aula09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Number of rows: ");
		int n = sc.nextInt();
		System.out.print("Number of columns: ");
		int m = sc.nextInt();

		double array[][] = new double[n][m];

		for (int i = 0; i < n; ++i) {
			System.out.println("Enter the number of the row #" + (i + 1) + ": ");
			for (int j = 0; j < m; ++j) {
				array[i][j] = sc.nextDouble();
			}
		}
		System.out.println("");

		System.out.println("RESULT of THE NEW VECTOR: ");
		double newVec[] = new double[n];
		for (int i = 0; i < n; ++i) {
			double sum = 0;
			for (int j = 0; j < m; ++j) {
				sum += array[i][j];
			}
			newVec[i] = sum;
			System.out.println(newVec[i]);
		}

		sc.close();

	}

}
