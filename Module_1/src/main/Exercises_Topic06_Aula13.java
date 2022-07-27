package main;

import java.util.Scanner;

public class Exercises_Topic06_Aula13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many elements? ");
		int n = sc.nextInt();
		System.out.println("");		
		
		int vecA[] = new int[n];
		int vecB[] = new int[n];
		
		System.out.println("Enter values for vector A. ");
		for (int i=0;i<n;++i) {
			System.out.print("Enter a number: ");
			vecA[i] = sc.nextInt();
		}
		
		System.out.println("");
		
		System.out.println("Enter values for vector B. ");
		for (int i=0;i<n;++i) {
			System.out.print("Enter a number: ");
			vecB[i] = sc.nextInt();
		}
		
		int vecC[] = new int[n];
		
		System.out.println("");
		System.out.println("RESULT: ");
		for (int i=0;i<n;++i) {
			vecC[i] = vecA[i]+vecB[i];
			System.out.println(vecC[i]);
		}
		
		sc.close();

	}

}
