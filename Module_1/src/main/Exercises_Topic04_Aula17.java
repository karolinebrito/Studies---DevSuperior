package main;

import java.util.Scanner;

public class Exercises_Topic04_Aula17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Initial time: ");
		int ti = sc.nextInt();
		System.out.print("Final time: ");
		int tf = sc.nextInt();
		
		if (tf>ti) {
			int duration = tf-ti;
			System.out.println("The game lasted " + duration + " hours.");
		}
		else {
			int duration = 24-ti+tf;
			System.out.println("The game lasted " + duration + " hours.");
		}
		
		sc.close();

	}

}
