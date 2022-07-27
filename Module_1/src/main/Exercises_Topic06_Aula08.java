package main;

import java.util.Scanner;

public class Exercises_Topic06_Aula08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers? ");
		int n = sc.nextInt();
		double sum = 0;
		
		double vec[] = new double[n];
		
		for (int i=0;i<n;++i) {
			System.out.print("Enter a number: ");
			vec[i] = sc.nextDouble();
			sum += vec[i];
		}
		System.out.println("");
		System.out.print("VALUES = ");
		for(int i=0;i<n;++i) {
			System.out.print(vec[i] + "   ");
		}
			
		System.out.println("");
		System.out.println("SUM = " + String.format("%.2f", sum));
		System.out.println("AVERAGE = " + String.format("%.2f", sum/n));
		
		sc.close();

	}

}
