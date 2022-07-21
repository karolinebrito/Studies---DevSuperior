package main;

import java.util.Scanner;

public class Exercises_Topic04_Aula18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x = ");
		double x = sc.nextDouble();		
		System.out.print("y = ");
		double y = sc.nextDouble();
		
		if (x>0 && y>0) {
			System.out.println("The poing belongs do Q1.");	
		}
		else if (x<0 && y>0) {
			System.out.println("The poing belongs do Q2.");
		}
		else if (x<0 && y<0) {
			System.out.println("The poing belongs do Q3.");
		}
		else if (x>0 && y<0) {
			System.out.println("The poing belongs do Q4.");
		}
		else if (x==0 && y!=0) {
			System.out.println("Axis Y.");
		}
		else if (x!=0 && y==0) {
			System.out.println("Axis X.");
		}
		else {
			System.out.println("The poing belongs do the ORIGIN.");
		}
		sc.close();

	}

}
