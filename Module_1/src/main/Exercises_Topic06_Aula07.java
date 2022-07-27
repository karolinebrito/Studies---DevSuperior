package main;

import java.util.Scanner;

public class Exercises_Topic06_Aula07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers = ");
		int n = sc.nextInt();
		
		int vec[] = new int[n];
		
		for (int i=0;i<n;i++) {
			System.out.print("Enter a number: ");
			vec[i] = sc.nextInt();
		}
		
		System.out.println("Negative numbers: ");
		
		for (int i=0;i<n;i++) {
			if (vec[i]<0) {
				System.out.println(vec[i]);;
			}
			else {
				
			}
		}
		
		sc.close();

	}

}
