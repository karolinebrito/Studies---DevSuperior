package main;

import java.util.Scanner;

public class Exercises_Topic05_Aula24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = sc.nextInt();
		int fatorial = 1;
		
		if (n==0) {
			System.out.println("FATORIAL = 1");
		}
		else {
			for (int i=0; i<n; ++i) {
				fatorial = fatorial*(n-i);
			}
			System.out.printf("FATORIAL = %d", fatorial);
		}
		
		sc.close();

	}

}
