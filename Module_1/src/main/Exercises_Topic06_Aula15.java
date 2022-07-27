package main;

import java.util.Scanner;

public class Exercises_Topic06_Aula15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many elements? ");
		int n = sc.nextInt();
		System.out.println("");
		
		int vec[] = new int[n];
		
		for (int i=0;i<n;++i) {
			System.out.print("Enter a number: ");
			vec[i] = sc.nextInt();
		}
		System.out.println("");
		
		int sum = 0;
		int total = 0;
		for (int i=0;i<n;++i) {
			if (vec[i]%2==0) {
				sum += vec[i];
				total += 1;
			}
		}
		if (total==0) {
			System.out.println("No pair numbers.");
		}
		else {
			System.out.println("Average of pair numbers = " + String.format("%.1f", (double) (sum/total)));
		}
		
		
		
		
		System.out.println("");
		
		sc.close();

	}

}
