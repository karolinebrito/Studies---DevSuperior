package main;

import java.util.Scanner;

public class Exercises_Topic05_Aula22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of cases: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; ++i) {
			System.out.printf("Case %d:\n", i);
			System.out.println("Enter 3 numbers: ");
			double vec[] = new double[3];
			for (int j=0; j<=2; ++j) {
				double number = sc.nextDouble();
				vec[j] = number;
			}
			System.out.printf("Average = %.2f\n", (2*vec[0] + 3*vec[1] + 5*vec[2])/(2+3+5));		
		}
		
		sc.close();

	}

}
