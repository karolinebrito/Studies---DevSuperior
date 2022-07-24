package main;

import java.util.Scanner;

public class Exercises_Topic05_Aula14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("Enter the password: ");
		int password = sc.nextInt();		
		
		if (password==2002) {
			System.out.println("Allowed access!");
		}
		else {
			while (password!=2002) {
			System.out.print("Incorrect password. Try again: ");
			password = sc.nextInt();
			}
		System.out.println("Allowed access!");
		}
				
		sc.close();

	}

}
