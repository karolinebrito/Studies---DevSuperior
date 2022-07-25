package main;

import java.util.Scanner;

public class Exercises_Topic05_Aula20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = sc.nextInt();
		
		int IN = 0;
		int OUT  = 0;;
		
		for (int i=1; i<=n; ++i) {
			System.out.print("Enter a number: ");
			int number = sc.nextInt();
			if (number>=10 && number<=20) {
				IN += 1;
			}
			else {
				OUT += 1;

			}
		}
		
		System.out.printf("IN = %d\n", IN);
		System.out.printf("OUT = %d", OUT);
			
		
		sc.close();

	}

}
