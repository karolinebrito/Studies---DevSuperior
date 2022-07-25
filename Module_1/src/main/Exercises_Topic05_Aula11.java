package main;

import java.util.Scanner;

public class Exercises_Topic05_Aula11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = sc.nextInt();
		
		for (int i=1; i<=10; ++i) {
			System.out.println(n + " x " + i + "= " + (n*i));
		}
		
		sc.close();

	}

}
