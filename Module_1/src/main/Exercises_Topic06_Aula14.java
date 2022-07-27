package main;

import java.util.Scanner;

public class Exercises_Topic06_Aula14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many elements? ");
		int n = sc.nextInt();
		System.out.println("");
		
		double vec[] = new double[n];
		
		for (int i=0;i<n;++i) {
			System.out.print("Enter a number: ");
			vec[i] = sc.nextDouble();
		}
		System.out.println("");
		
		double sum=0;
		for (int i=0;i<n;++i) {
			sum += vec[i];
		}
		System.out.println("");
		
		double average = sum/n;
		System.out.printf("Average: %.3f", average);
		System.out.println("");
		
		System.out.println("Elements lower than average: ");
		for (int i=0;i<n;++i) {
			if (vec[i]<average) {
				System.out.println(vec[i]);
			}
		}		
		
		sc.close();
		
	}

}
