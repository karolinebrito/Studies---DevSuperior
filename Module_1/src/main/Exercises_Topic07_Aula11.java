package main;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises_Topic07_Aula11 {

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
		
		System.out.println("Highest number of each row: ");
		double vec[] = new double[n];
		for (int i=0; i<n; ++i) {
			for (int j=0; j<n; ++j) {
				vec[j] = array[i][j];
			}
			Arrays.sort(vec);
			System.out.println(vec[vec.length-1]);
		}
		System.out.println("");
		
		
		
		sc.close();

	}

}
