package main;

import java.util.Scanner;

public class Exercises_Topic05_Aula19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.print("x = ");
		x = sc.nextInt();
		
		for (int i=1; i<=x; ++i) {
			if (i%2!=0) {
				System.out.print(i);
				System.out.println("");
			}
			else {
				
			}
				
		}
		
		sc.close();

	}

}
