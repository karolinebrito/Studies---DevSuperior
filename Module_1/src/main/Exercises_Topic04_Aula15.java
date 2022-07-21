package main;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises_Topic04_Aula15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vec[] = new int[2];
		
		for (int i=0; i<vec.length; i++) {
			System.out.print("Element " + i + ": ");
			vec[i] = sc.nextInt();
		}
		
		Arrays.sort(vec);
		
		int rest = vec[1]%vec[0];
		
		if (rest==0) {
			System.out.print("They are multiples.");
		}
		else {
			System.out.print("They are not multiples.");
		}
		
		sc.close();

	}

}
