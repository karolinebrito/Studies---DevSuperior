package main;

import java.util.Scanner;

public class Exercises_Topic06_Aula11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers: ");
		int n = sc.nextInt();
		int vec[] = new int[n];
		
		for (int i=0; i<n; ++i) {
			System.out.print("Enter a number: ");
			vec[i] = sc.nextInt();
		}
		
		System.out.println("");
		
		int sum = 0;
		System.out.println("Pair numbers: ");
		for (int i=0; i<n; ++i) {
			if (vec[i]%2==0) {
				System.out.print(vec[i] + "   ");
				sum += 1;
			}			
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Amount of pair numbers: " + sum);
		
		sc.close();

	}

}
