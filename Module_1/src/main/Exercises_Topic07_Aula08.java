package main;

import java.util.Scanner;

public class Exercises_Topic07_Aula08 {

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
		
		System.out.println("Principal Diagonal: ");		
		for (int i=0; i<n; ++i) {
			for (int j=0; j<n; ++j) {
				if (i==j) {
					System.out.print(array[i][j] + "   ");
				}
			}
		}
		System.out.println("");
		
		int sum = 0;
		for (int i=0; i<n; ++i) {
			for (int j=0; j<n; ++j) {
				if (array[i][j]<0) {
					sum += 1;
				}
			}
		}
		
		System.out.println("Number of negatives: " + sum);
		
		
		
		
		
		sc.close();

	}

}
