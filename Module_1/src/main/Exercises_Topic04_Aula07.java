package main;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises_Topic04_Aula07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vec = new int[3];
		
		for (int i=0; i<3; i++) {
			System.out.print("Value " + (i+1) + ": ");
			vec[i] = sc.nextInt();
		}
		
		Arrays.sort(vec);
		
		System.out.println("The smallest number is " + vec[0] + ".");	
				
		sc.close();

	}

}
