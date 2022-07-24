package main;

import java.util.Scanner;

public class Exercises_Topic05_Aula05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("x = ");
		x = sc.nextInt();
		System.out.print("y = ");
		y = sc.nextInt();
				
		while (x!=y) {
			if (x<y) {
				System.out.println("Crescent.");
			}
			else {
				System.out.println("Decrescent");
			}
			System.out.println();
			System.out.print("x = ");
			x = sc.nextInt();
			System.out.print("y = ");
			y = sc.nextInt();	
		}
		
		sc.close();

	}

}
