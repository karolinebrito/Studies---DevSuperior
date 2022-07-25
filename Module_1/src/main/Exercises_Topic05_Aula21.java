package main;

import java.util.Scanner;

public class Exercises_Topic05_Aula21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; ++i) {
			System.out.print("Enter a number: ");
			int number = sc.nextInt();
			if (number%2==0 && number>0) {
				System.out.print("Positive even.\n");
			}
			else if (number%2==0 && number<0) {
				System.out.print("Negative even.\n");
			}
			else if (number%2!=0 && number>0) {
				System.out.print("Positive odd.\n");
			}
			else if (number%2!=0 && number<0) {
				System.out.print("Negative odd.\n");
			}
			else {
				System.out.print("Zero.\n");
			}
		}
		
		sc.close();

	}

}
