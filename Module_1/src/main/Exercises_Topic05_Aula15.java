package main;

import java.util.Scanner;

public class Exercises_Topic05_Aula15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.print("x = ");
		x = sc.nextDouble();
		System.out.print("y = ");
		y = sc.nextDouble();
		
		while (x!=0 && y!=0) {
			
			if (x>0 && y>0) {
				System.out.println("Q1");
			}
			else if (x<0 && y>0) {
				System.out.println("Q2");
			}
			else if (x<0 && y<0) {
				System.out.println("Q3");
			}
			else {
				System.out.println("Q4");
			}
			System.out.println("");
			System.out.print("x = ");
			x = sc.nextDouble();
			System.out.print("y = ");
			y = sc.nextDouble();
		}
		
		sc.close();

	}

}
